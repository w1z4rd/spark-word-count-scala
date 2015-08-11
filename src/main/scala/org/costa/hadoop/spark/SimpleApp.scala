package org.costa.hadoop.spark

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

/**
 * @author costelradulescu
 */
object SimpleApp {
  def main(args: Array[String]) {
    val fileA = "/user/spark/fileA"
    val fileB = "/user/spark/fileB"
    val conf = new SparkConf().setAppName("Simple Application")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(fileA, 2).cache()
    val numAs = logData.filter(line ⇒ line.contains("a")).count()
    val numBs = logData.filter(line ⇒ line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
  }
}

