package kotlin.coroutines.jvm.internal;

/* compiled from: DebugProbes.kt */
@kotlin.Metadata(mv = {1, 5, 1}, k = 2, xi = 48, d1 = {"\ufffd\ufffd\u0012\n\ufffd\ufffd\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\ufffd\ufffd\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\ufffd\ufffd\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\ufffd\ufffd\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\ufffd\ufffd\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\ufffd\ufffd\u00a8\u0006\b"}, d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", "T", "completion", "probeCoroutineResumed", "", "frame", "probeCoroutineSuspended", "integration-testing_debugAgentTest"})
/* loaded from: io.tacocrypto.app.apk:DebugProbesKt.bin */
public final class DebugProbesKt {
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r3) {
            r0 = r3
            java.lang.String r1 = "completion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            r1 = r3
            kotlin.coroutines.Continuation r0 = r0.probeCoroutineCreated$kotlinx_coroutines_core(r1)
            return r0
    }

    public static final void probeCoroutineResumed(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3) {
            r0 = r3
            java.lang.String r1 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            r1 = r3
            r0.probeCoroutineResumed$kotlinx_coroutines_core(r1)
            return
    }

    public static final void probeCoroutineSuspended(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3) {
            r0 = r3
            java.lang.String r1 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            r1 = r3
            r0.probeCoroutineSuspended$kotlinx_coroutines_core(r1)
            return
    }
}
