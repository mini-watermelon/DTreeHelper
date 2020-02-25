var gulp=require('gulp');
var uglify=require('gulp-uglify');

gulp.task('default',function(){
    return gulp.src('layui_ext/dtree/dtree.js')
    .pipe(uglify())
    .pipe(gulp.dest('layui_ext/dist'))
})