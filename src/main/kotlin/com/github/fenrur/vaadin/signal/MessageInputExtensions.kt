package com.github.fenrur.vaadin.signal

import com.github.fenrur.signal.MutableSignal
import com.vaadin.flow.component.messages.MessageInput

// ============================================
// MessageInput extensions
// ============================================
/**
 * Reactive on submit handler for MessageInput.
 * The signal will be updated with the submitted message.
 */
@JvmName("messageInputOnSubmitMutableSignal")
fun MessageInput.onSubmit(signal: MutableSignal<String?>): MessageInput {
    addSubmitListener { event ->
        signal.value = event.value
    }
    return this
}
