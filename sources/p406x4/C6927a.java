package p406x4;

/* renamed from: x4.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C6927a implements android.media.MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ int f26960a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f26961b;

    /* renamed from: c */
    public final /* synthetic */ p406x4.InterfaceC6937k.c f26962c;

    public /* synthetic */ C6927a(p406x4.C6928b r2, p406x4.InterfaceC6937k.c r3) {
            r1 = this;
            r0 = 0
            r1.f26960a = r0
            r1.<init>()
            r1.f26961b = r2
            r1.f26962c = r3
            return
    }

    public /* synthetic */ C6927a(p406x4.C6945s r2, p406x4.InterfaceC6937k.c r3) {
            r1 = this;
            r0 = 1
            r1.f26960a = r0
            r1.<init>()
            r1.f26961b = r2
            r1.f26962c = r3
            return
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(android.media.MediaCodec r7, long r8, long r10) {
            r6 = this;
            int r7 = r6.f26960a
            switch(r7) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L19
        L6:
            java.lang.Object r7 = r6.f26961b
            r1 = r7
            x4.b r1 = (p406x4.C6928b) r1
            x4.k$c r7 = r6.f26962c
            java.util.Objects.requireNonNull(r1)
            r0 = r7
            w5.h$b r0 = (p387w5.C6805h.b) r0
            r2 = r8
            r4 = r10
            r0.m13873b(r1, r2, r4)
            return
        L19:
            java.lang.Object r7 = r6.f26961b
            r1 = r7
            x4.s r1 = (p406x4.C6945s) r1
            x4.k$c r7 = r6.f26962c
            java.util.Objects.requireNonNull(r1)
            r0 = r7
            w5.h$b r0 = (p387w5.C6805h.b) r0
            r2 = r8
            r4 = r10
            r0.m13873b(r1, r2, r4)
            return
    }
}
