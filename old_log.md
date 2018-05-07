# AnimatedPieView update log

### 18/04/27 - ver 1.2.2 (unpublished)
 - Problem with text not drawn when repairing animPie(false)

### 18/03/01 - ver 1.2.1
 - Allow definition of animation interpolator
 - Fix the problem that the angle is too small to be cached and the problem that the end point cannot be responded

### 18/02/26 - ver 1.2.0
 - 1.2.0
 - Completely reconstruct the entire project, making subcontracting clearer, more legible code, and better scalability
 - Modify a large number of methods (deprecated methods still apply)
 
### 18/01/05 - ver 1.1.4
 - 1.1.4
 - Fixed a problem with donut click range
 - Fixed the problem of slight deviations between doughnuts

### 17/12/5 - ver 1.1.3
 - Optimized hardware acceleration, fix huge errors before setting LayoutType in onDraw(). . .
 - Optimize demo
 - config fixed problem with `addDatas()` generics
 - Duplicate application of config migrated to `start()` method

### 17/12/2 - ver 1.1.2
 - Optimize methods in the animation to find angle entities, reduce the loop -> AnimatedPieViewHelper#findPieinfoWithAngle()
 - Increase the pen tip style

#### 17/12/1 - ver 1.1.1
 - ʻAnimatedPieViewConfig.AnimatedPieViewHelper#prepare()` takes absolute values ​​when calculating values, and is fault tolerant for negative numbers
 - The default interpolator takes `LinearInterpolator`, temporarily removes the interpolator definition method, and reopens it if it is resolved[issue#2](https://github.com/razerdp/AnimatedPieView/issues/2)
 - Remove the implementation with a minimum angle of 1 (when the value is 0)

#### 17/11/29 - ver 1.1.0
 - Increase whether to allow donut click method `setCanTouch(boolean)`
 - Increase donut clearance angle `setSplitAngle(float)`
 - Focus donut's alpha manifestation `setFocusAlphaType()`
 - Update demo usage example

#### 17/11/25 - ver 1.0.8~1.0.9
 - Increase text adaptive animation position

#### 17/11/24 - ver 1.0.7

 - Fix the problem of drawing more and more cards when you click
    + Reason (guess): path is not reset, however, onDraw will continue to add point data, causing each donut to draw back and forth, and then more and more cards.

#### 17/11/23 - ver 1.0.6

 - Finished line animation

#### 17/11/21 - ver 1.0.5:

  - Fix the problem of indicating the line vacancy
  - Increase the text misalignment parameter `setDirectText(boolean)`
  - Increase the size of the text indicator start point set `setTextPointRadius(float)`
  - Increase the text indicator line width size set `setTextLineStrokeWidth(int)`
  - Increase text pointer line length `setTextLineTransitionLength(int)`
  - Increase the size of the text indicator starting from the radius of the outer circle `setTextLineStartMargin(float)`

#### 17/11/20 - ver 1.0.4:

  - Modified method name `getTextMarginBottom()`->`getTextMarginLine()`
  - Increased clickback callback `OnPieSelectListener()` to report if the currently selected donut is in a floating state
  - Increase javadoc