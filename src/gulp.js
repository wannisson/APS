var gulp = require('gulp');
var comment = require('gulp-comment');

gulp.task('connect', function()){
  connect.server({
    root: 'app',
    livereload: true,
    port: 8081
  });
});

gulp.task('html', function()){
  gulp.src('./app/**/*.html')
  .pipe(connect.reload());
});

gulp.task('watch', function()){
  gulp.watch(['./app/**/*.html'],['html']);
});

gulp.task('default',['connect', 'watch']);
