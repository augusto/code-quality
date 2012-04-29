/**
 * This example shows a simple workflow which contains the current state and a history
 * of the previous states. The example also contains some code of a potential client.
 *
 * In the broken example, the workflow is just a data structure and the client is responsible
 * for setting the state and the history. The problem with this approach is that the encapsulation
 * of the Workflow class is broke, as it leaks its internal logic/protocol, and as a consequence
 * the client is responsible for updating the history containing the previous states of the
 * workflow.
 *
 * A better implementation, hides the internals of the workflow, and only exposes methods to manage
 * the different states in the workflow. This workflow implementation doesn't expose any of the
 * internals.
 *
 * This pattern is also called "Tell, don't ask" because...
 */
package org.workshop.code.encapsulation;