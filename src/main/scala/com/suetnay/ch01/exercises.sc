// 1. 在scala REPL中输入3. 然后按下tab键，有哪些方法可以被调用？

// 2. 在scala REPL中，计算3的平方根，然后对该值求平方，现在这个结果跟3相差多少？
scala.math.sqrt(3)  // res0: Double = 1.7320508075688772
scala.math.pow(res0,2)  // res1: Double = 2.9999999999999996
3 - res1  // res2: Double = 4.440892098500626E-16

// 3. res变量是 val 还是 var ?
// res变量是val，不可变
// res2 = 100  // 报错

// 4. scala允许你用数字去乘以字符串，去REPL中试试 "crazy"*3 ,这个操作是做什么的？在scaladoc中如何找到这个操作？
// 在StringOps这个类中，这个操作做的是复制三个字符串并拼接起来。
"crazy"*3  // res3: String = crazycrazycrazy

// 5. 10 max 2 的含义是什么？max方法定义在那个类中？
// 得到两个数中的最大值， 在RichInt中
10 max 2  // res4: Int = 10

// 6. 使用bigint 计算2的1024次方；
val num: BigInt = 2
num.pow(1024)  //

// 7. 为了在使用 probablePrime(100,Random)获取随机素数时不再probablePrime和Radom之前使用任何限定符，你需要引入什么？
// 引入 scala.util.Random ;
import scala.util.Random
BigInt.probablePrime(100, Random)

// 8. 创建随机文件的方式之一是生成一个随机的BigInt,然后将它转换成36进制，输出类似于“xxxxxsfsdgfgs”这样的字符串，在scaladoc中找到实现该逻辑的方法；
BigInt.probablePrime(100, Random).toString(36)

// 9. 在scala中如何获取一个字符串的首字符，和末字符？
"hello tom".head
"hello tom".last

// 10. take , drop , takeRight , dropRight 这些字符串函数是做什么用的？和substring相比，他们的优点和缺点都有哪些？
// take (n) 取前n个字符，然后组成字符串；
// drop (n) 去掉前n个字符，然后返回剩下的字符串
// takeRight 从后面取N个字符，组成字符串
// dropRight 从后面去掉N个字符安，剩下的字符组成字符串
//
// 优点：直接，丰富多样
// 缺点：从中间截取字符串不支持