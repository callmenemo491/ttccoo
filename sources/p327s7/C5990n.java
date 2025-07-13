package p327s7;

/* renamed from: s7.n */
/* loaded from: classes.dex */
public final class C5990n<TResult> implements p327s7.InterfaceC5991o<TResult>, p327s7.InterfaceC5979c, p327s7.InterfaceC5981e, p327s7.InterfaceC5982f {

    /* renamed from: Y */
    public final /* synthetic */ int f23092Y;

    /* renamed from: Z */
    public final java.util.concurrent.Executor f23093Z;

    /* renamed from: a0 */
    public final java.lang.Object f23094a0;

    /* renamed from: b0 */
    public java.lang.Object f23095b0;

    public C5990n(java.util.concurrent.Executor r2, p327s7.InterfaceC5979c r3) {
            r1 = this;
            r0 = 0
            r1.f23092Y = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f23094a0 = r0
            r1.f23093Z = r2
            r1.f23095b0 = r3
            return
    }

    public C5990n(java.util.concurrent.Executor r2, p327s7.InterfaceC5980d r3) {
            r1 = this;
            r0 = 1
            r1.f23092Y = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f23094a0 = r0
            r1.f23093Z = r2
            r1.f23095b0 = r3
            return
    }

    public C5990n(java.util.concurrent.Executor r2, p327s7.InterfaceC5981e r3) {
            r1 = this;
            r0 = 2
            r1.f23092Y = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f23094a0 = r0
            r1.f23093Z = r2
            r1.f23095b0 = r3
            return
    }

    public C5990n(java.util.concurrent.Executor r2, p327s7.InterfaceC5982f r3) {
            r1 = this;
            r0 = 3
            r1.f23092Y = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f23094a0 = r0
            r1.f23093Z = r2
            r1.f23095b0 = r3
            return
    }

    public C5990n(java.util.concurrent.Executor r2, p327s7.InterfaceC5984h r3, p327s7.C5993q r4) {
            r1 = this;
            r0 = 4
            r1.f23092Y = r0
            r1.<init>()
            r1.f23093Z = r2
            r1.f23094a0 = r3
            r1.f23095b0 = r4
            return
    }

    @Override // p327s7.InterfaceC5979c
    /* renamed from: a */
    public void mo7372a() {
            r1 = this;
            java.lang.Object r0 = r1.f23095b0
            s7.q r0 = (p327s7.C5993q) r0
            r0.m12474s()
            return
    }

    @Override // p327s7.InterfaceC5991o
    /* renamed from: b */
    public final void mo12470b(p327s7.AbstractC5985i r4) {
            r3 = this;
            int r0 = r3.f23092Y
            r1 = 0
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L50;
                case 2: goto L29;
                case 3: goto L8;
                default: goto L6;
            }
        L6:
            goto L8b
        L8:
            boolean r0 = r4.mo12455m()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r3.f23094a0
            monitor-enter(r0)
            java.lang.Object r2 = r3.f23095b0     // Catch: java.lang.Throwable -> L25
            s7.f r2 = (p327s7.InterfaceC5982f) r2     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            goto L28
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.Executor r0 = r3.f23093Z
            h6.a0 r2 = new h6.a0
            r2.<init>(r3, r4, r1)
            r0.execute(r2)
            goto L28
        L25:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
        L28:
            return
        L29:
            boolean r0 = r4.mo12455m()
            if (r0 != 0) goto L4f
            boolean r0 = r4.mo12453k()
            if (r0 != 0) goto L4f
            java.lang.Object r0 = r3.f23094a0
            monitor-enter(r0)
            java.lang.Object r2 = r3.f23095b0     // Catch: java.lang.Throwable -> L4c
            s7.e r2 = (p327s7.InterfaceC5981e) r2     // Catch: java.lang.Throwable -> L4c
            if (r2 != 0) goto L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.Executor r0 = r3.f23093Z
            h6.a0 r2 = new h6.a0
            r2.<init>(r3, r4, r1)
            r0.execute(r2)
            goto L4f
        L4c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r4
        L4f:
            return
        L50:
            java.lang.Object r0 = r3.f23094a0
            monitor-enter(r0)
            java.lang.Object r1 = r3.f23095b0     // Catch: java.lang.Throwable -> L67
            s7.d r1 = (p327s7.InterfaceC5980d) r1     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            goto L66
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.Executor r0 = r3.f23093Z
            h6.a0 r1 = new h6.a0
            r1.<init>(r3, r4)
            r0.execute(r1)
        L66:
            return
        L67:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r4
        L6a:
            boolean r4 = r4.mo12453k()
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r3.f23094a0
            monitor-enter(r4)
            java.lang.Object r0 = r3.f23095b0     // Catch: java.lang.Throwable -> L87
            s7.c r0 = (p327s7.InterfaceC5979c) r0     // Catch: java.lang.Throwable -> L87
            if (r0 != 0) goto L7b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L87
            goto L8a
        L7b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.Executor r4 = r3.f23093Z
            f6.i r0 = new f6.i
            r0.<init>(r3)
            r4.execute(r0)
            goto L8a
        L87:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L87
            throw r0
        L8a:
            return
        L8b:
            java.util.concurrent.Executor r0 = r3.f23093Z
            h6.a0 r2 = new h6.a0
            r2.<init>(r3, r4, r1)
            r0.execute(r2)
            return
    }

    @Override // p327s7.InterfaceC5981e
    /* renamed from: c */
    public void mo4109c(java.lang.Exception r2) {
            r1 = this;
            java.lang.Object r0 = r1.f23095b0
            s7.q r0 = (p327s7.C5993q) r0
            r0.m12472q(r2)
            return
    }

    @Override // p327s7.InterfaceC5982f
    /* renamed from: d */
    public void mo1270d(TContinuationResult r2) {
            r1 = this;
            java.lang.Object r0 = r1.f23095b0
            s7.q r0 = (p327s7.C5993q) r0
            r0.m12473r(r2)
            return
    }
}
