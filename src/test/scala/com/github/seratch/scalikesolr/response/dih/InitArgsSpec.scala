package com.github.seratch.scalikesolr.response.dih

import org.scalatest._
import org.scalatest.matchers._
import com.github.seratch.scalikesolr.SolrDocument

class InitArgsSpec extends FlatSpec with ShouldMatchers {

  behavior of "InitArgs"

  it should "be available" in {
    val defaults: SolrDocument = null
    val instance = new InitArgs(defaults)
    instance should not be null
  }

}
