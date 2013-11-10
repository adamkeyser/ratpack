/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ratpack.manual.snippets.fixtures

class GroovyChainDslFixture implements SnippetFixture {

  @Override
  public void setup() {
  }

  @Override
  public void cleanup() {
  }

  @Override
  public String pre() {
"""
import ratpack.launch.LaunchConfig;
import ratpack.groovy.handling.Chain;
import ratpack.groovy.handling.internal.DefaultChain;
import ratpack.groovy.internal.Util;

Util.configureDelegateOnly((Chain) new DefaultChain([], [:] as LaunchConfig, null)) {
"""
  }

  @Override
  public String post() {
"""
}
"""
  }
}
