package com.ebiznext.comet.job.index.jdbcload

import com.ebiznext.comet.TestHelper

class JdbcLoadJobSpec extends TestHelper {
  new WithSettings() {
    "All JdbcLoad Config" should "be known and taken  into account" in {
      val rendered = JdbcLoadConfig.usage()
      val expected =
        """
          |Usage: comet [options]
          |
          |  --source_file <value>    Full Path to source file
          |  --output_table <value>   JDBC Output Table
          |  --driver <value>         JDBC Driver to use
          |  --partitions <value>     Number of Spark Partitions
          |  --batch_size <value>     JDBC Batch Size
          |  --user <value>           JDBC user
          |  --password <value>       JDBC password
          |  --url <value>            Database JDBC URL
          |""".stripMargin
      rendered.substring(rendered.indexOf("Usage:")).replaceAll("\\s", "") shouldEqual expected
        .replaceAll("\\s", "")

    }
  }
}
