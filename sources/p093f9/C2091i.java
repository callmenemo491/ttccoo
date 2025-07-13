package p093f9;

/* renamed from: f9.i */
/* loaded from: classes.dex */
public final class C2091i {

    /* renamed from: a */
    public final p204l9.C4198a0.b f9513a;

    public C2091i(p204l9.C4198a0.b r1) {
            r0 = this;
            r0.<init>()
            r0.f9513a = r1
            return
    }

    /* renamed from: e */
    public static int m5527e() {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r1 = 4
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
        La:
            if (r3 != 0) goto L2c
            r0.nextBytes(r1)
            r3 = r1[r2]
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 24
            r4 = 1
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            r4 = 2
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r3 = r3 | r4
            r4 = 3
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            goto La
        L2c:
            return r3
    }

    /* renamed from: f */
    public static p093f9.C2091i m5528f(p093f9.C2090h r3) {
            f9.i r0 = new f9.i
            l9.a0 r3 = r3.f9512a
            m9.x$f r1 = p221m9.AbstractC4501x.f.f18300c0
            r2 = 0
            java.lang.Object r1 = r3.mo9340o(r1, r2, r2)
            m9.x$a r1 = (p221m9.AbstractC4501x.a) r1
            r1.m10377o()
            MessageType extends m9.x<MessageType, BuilderType> r2 = r1.f18293Z
            r1.m10379q(r2, r3)
            l9.a0$b r1 = (p204l9.C4198a0.b) r1
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    /* renamed from: a */
    public synchronized int m5529a(p204l9.C4231y r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            l9.a0$c r2 = r1.m5531c(r2)     // Catch: java.lang.Throwable -> L29
            l9.a0$b r0 = r1.f9513a     // Catch: java.lang.Throwable -> L29
            r0.m10377o()     // Catch: java.lang.Throwable -> L29
            MessageType extends m9.x<MessageType, BuilderType> r0 = r0.f18293Z     // Catch: java.lang.Throwable -> L29
            l9.a0 r0 = (p204l9.C4198a0) r0     // Catch: java.lang.Throwable -> L29
            p204l9.C4198a0.m9345y(r0, r2)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L23
            l9.a0$b r3 = r1.f9513a     // Catch: java.lang.Throwable -> L29
            int r0 = r2.m9357C()     // Catch: java.lang.Throwable -> L29
            r3.m10377o()     // Catch: java.lang.Throwable -> L29
            MessageType extends m9.x<MessageType, BuilderType> r3 = r3.f18293Z     // Catch: java.lang.Throwable -> L29
            l9.a0 r3 = (p204l9.C4198a0) r3     // Catch: java.lang.Throwable -> L29
            p204l9.C4198a0.m9344x(r3, r0)     // Catch: java.lang.Throwable -> L29
        L23:
            int r2 = r2.m9357C()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            return r2
        L29:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: b */
    public synchronized p093f9.C2090h m5530b() {
            r1 = this;
            monitor-enter(r1)
            l9.a0$b r0 = r1.f9513a     // Catch: java.lang.Throwable -> Lf
            m9.x r0 = r0.m10375k()     // Catch: java.lang.Throwable -> Lf
            l9.a0 r0 = (p204l9.C4198a0) r0     // Catch: java.lang.Throwable -> Lf
            f9.h r0 = p093f9.C2090h.m5524a(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* renamed from: c */
    public final synchronized p204l9.C4198a0.c m5531c(p204l9.C4231y r5) {
            r4 = this;
            monitor-enter(r4)
            l9.w r0 = p093f9.C2100r.m5551e(r5)     // Catch: java.lang.Throwable -> L49
            int r1 = r4.m5532d()     // Catch: java.lang.Throwable -> L49
            l9.g0 r5 = r5.m9538B()     // Catch: java.lang.Throwable -> L49
            l9.g0 r2 = p204l9.EnumC4210g0.f17361Z     // Catch: java.lang.Throwable -> L49
            if (r5 != r2) goto L13
            l9.g0 r5 = p204l9.EnumC4210g0.f17362a0     // Catch: java.lang.Throwable -> L49
        L13:
            l9.a0$c$a r2 = p204l9.C4198a0.c.m9351G()     // Catch: java.lang.Throwable -> L49
            r2.m10377o()     // Catch: java.lang.Throwable -> L49
            MessageType extends m9.x<MessageType, BuilderType> r3 = r2.f18293Z     // Catch: java.lang.Throwable -> L49
            l9.a0$c r3 = (p204l9.C4198a0.c) r3     // Catch: java.lang.Throwable -> L49
            p204l9.C4198a0.c.m9353x(r3, r0)     // Catch: java.lang.Throwable -> L49
            r2.m10377o()     // Catch: java.lang.Throwable -> L49
            MessageType extends m9.x<MessageType, BuilderType> r0 = r2.f18293Z     // Catch: java.lang.Throwable -> L49
            l9.a0$c r0 = (p204l9.C4198a0.c) r0     // Catch: java.lang.Throwable -> L49
            p204l9.C4198a0.c.m9350A(r0, r1)     // Catch: java.lang.Throwable -> L49
            l9.x r0 = p204l9.EnumC4230x.f17386a0     // Catch: java.lang.Throwable -> L49
            r2.m10377o()     // Catch: java.lang.Throwable -> L49
            MessageType extends m9.x<MessageType, BuilderType> r1 = r2.f18293Z     // Catch: java.lang.Throwable -> L49
            l9.a0$c r1 = (p204l9.C4198a0.c) r1     // Catch: java.lang.Throwable -> L49
            p204l9.C4198a0.c.m9355z(r1, r0)     // Catch: java.lang.Throwable -> L49
            r2.m10377o()     // Catch: java.lang.Throwable -> L49
            MessageType extends m9.x<MessageType, BuilderType> r0 = r2.f18293Z     // Catch: java.lang.Throwable -> L49
            l9.a0$c r0 = (p204l9.C4198a0.c) r0     // Catch: java.lang.Throwable -> L49
            p204l9.C4198a0.c.m9354y(r0, r5)     // Catch: java.lang.Throwable -> L49
            m9.x r5 = r2.m10375k()     // Catch: java.lang.Throwable -> L49
            l9.a0$c r5 = (p204l9.C4198a0.c) r5     // Catch: java.lang.Throwable -> L49
            monitor-exit(r4)
            return r5
        L49:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    /* renamed from: d */
    public final synchronized int m5532d() {
            r3 = this;
            monitor-enter(r3)
        L1:
            int r0 = m5527e()     // Catch: java.lang.Throwable -> L36
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L36
            l9.a0$b r1 = r3.f9513a     // Catch: java.lang.Throwable -> L33
            MessageType extends m9.x<MessageType, BuilderType> r1 = r1.f18293Z     // Catch: java.lang.Throwable -> L33
            l9.a0 r1 = (p204l9.C4198a0) r1     // Catch: java.lang.Throwable -> L33
            java.util.List r1 = r1.m9347B()     // Catch: java.lang.Throwable -> L33
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L18:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33
            l9.a0$c r2 = (p204l9.C4198a0.c) r2     // Catch: java.lang.Throwable -> L33
            int r2 = r2.m9357C()     // Catch: java.lang.Throwable -> L33
            if (r2 != r0) goto L18
            r1 = 1
            goto L2d
        L2c:
            r1 = 0
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L31
            goto L1
        L31:
            monitor-exit(r3)
            return r0
        L33:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
