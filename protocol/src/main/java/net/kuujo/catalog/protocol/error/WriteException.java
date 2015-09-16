/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.kuujo.catalog.protocol.error;

/**
 * Write exception.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public class WriteException extends RaftException {
  private static final RaftError.Type TYPE = RaftError.Type.COMMAND_ERROR;

  public WriteException(String message, Object... args) {
    super(TYPE, message, args);
  }

  public WriteException(Throwable cause, String message, Object... args) {
    super(TYPE, cause, message, args);
  }

  public WriteException(Throwable cause) {
    super(TYPE, cause);
  }

}
