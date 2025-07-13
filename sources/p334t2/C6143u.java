package p334t2;

/* renamed from: t2.u */
/* loaded from: classes.dex */
public class C6143u implements p180k2.InterfaceC3674f<java.io.InputStream, android.graphics.Bitmap> {

    /* renamed from: a */
    public final p334t2.C6134l f23722a;

    /* renamed from: b */
    public final p229n2.InterfaceC4672b f23723b;

    /* renamed from: t2.u$a */
    public static class a implements p334t2.C6134l.b {

        /* renamed from: a */
        public final p334t2.C6142t f23724a;

        /* renamed from: b */
        public final p106g3.C2232d f23725b;

        public a(p334t2.C6142t r1, p106g3.C2232d r2) {
                r0 = this;
                r0.<init>()
                r0.f23724a = r1
                r0.f23725b = r2
                return
        }

        @Override // p334t2.C6134l.b
        /* renamed from: a */
        public void mo12679a(p229n2.InterfaceC4673c r2, android.graphics.Bitmap r3) {
                r1 = this;
                g3.d r0 = r1.f23725b
                java.io.IOException r0 = r0.f10199Z
                if (r0 == 0) goto Lc
                if (r3 == 0) goto Lb
                r2.mo10694f(r3)
            Lb:
                throw r0
            Lc:
                return
        }

        @Override // p334t2.C6134l.b
        /* renamed from: b */
        public void mo12680b() {
                r2 = this;
                t2.t r0 = r2.f23724a
                monitor-enter(r0)
                byte[] r1 = r0.f23716Y     // Catch: java.lang.Throwable -> La
                int r1 = r1.length     // Catch: java.lang.Throwable -> La
                r0.f23718a0 = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r0)
                return
            La:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }
    }

    public C6143u(p334t2.C6134l r1, p229n2.InterfaceC4672b r2) {
            r0 = this;
            r0.<init>()
            r0.f23722a = r1
            r0.f23723b = r2
            return
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public p214m2.InterfaceC4345w<android.graphics.Bitmap> mo8132a(java.io.InputStream r10, int r11, int r12, p180k2.C3673e r13) {
            r9 = this;
            java.io.InputStream r10 = (java.io.InputStream) r10
            boolean r0 = r10 instanceof p334t2.C6142t
            if (r0 == 0) goto La
            t2.t r10 = (p334t2.C6142t) r10
            r0 = 0
            goto L14
        La:
            t2.t r0 = new t2.t
            n2.b r1 = r9.f23723b
            r0.<init>(r10, r1)
            r10 = 1
            r10 = r0
            r0 = 1
        L14:
            java.util.Queue<g3.d> r1 = p106g3.C2232d.f10197a0
            monitor-enter(r1)
            r2 = r1
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch: java.lang.Throwable -> L50
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L50
            g3.d r2 = (p106g3.C2232d) r2     // Catch: java.lang.Throwable -> L50
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L28
            g3.d r2 = new g3.d
            r2.<init>()
        L28:
            r2.f10198Y = r10
            g3.h r4 = new g3.h
            r4.<init>(r2)
            t2.u$a r8 = new t2.u$a
            r8.<init>(r10, r2)
            t2.l r3 = r9.f23722a     // Catch: java.lang.Throwable -> L46
            r5 = r11
            r6 = r12
            r7 = r13
            m2.w r11 = r3.m12676a(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L46
            r2.release()
            if (r0 == 0) goto L45
            r10.release()
        L45:
            return r11
        L46:
            r11 = move-exception
            r2.release()
            if (r0 == 0) goto L4f
            r10.release()
        L4f:
            throw r11
        L50:
            r10 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L50
            throw r10
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public boolean mo8133b(java.io.InputStream r1, p180k2.C3673e r2) {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            t2.l r1 = r0.f23722a
            java.util.Objects.requireNonNull(r1)
            r1 = 1
            return r1
    }
}
