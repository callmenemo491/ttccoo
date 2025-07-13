package p260oi;

/* renamed from: oi.a0 */
/* loaded from: classes.dex */
public class C5279a0 {

    /* renamed from: d */
    public static final p260oi.C5279a0 f20485d = null;

    /* renamed from: a */
    public boolean f20486a;

    /* renamed from: b */
    public long f20487b;

    /* renamed from: c */
    public long f20488c;

    /* renamed from: oi.a0$a */
    public static final class a extends p260oi.C5279a0 {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p260oi.C5279a0
        /* renamed from: d */
        public p260oi.C5279a0 mo11527d(long r1) {
                r0 = this;
                return r0
        }

        @Override // p260oi.C5279a0
        /* renamed from: f */
        public void mo11529f() {
                r0 = this;
                return
        }

        @Override // p260oi.C5279a0
        /* renamed from: g */
        public p260oi.C5279a0 mo11530g(long r1, java.util.concurrent.TimeUnit r3) {
                r0 = this;
                java.lang.String r1 = "unit"
                p214m2.C4339q.m9706k(r3, r1)
                return r0
        }
    }

    static {
            oi.a0$a r0 = new oi.a0$a
            r0.<init>()
            p260oi.C5279a0.f20485d = r0
            return
    }

    public C5279a0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public p260oi.C5279a0 mo11524a() {
            r1 = this;
            r0 = 0
            r1.f20486a = r0
            return r1
    }

    /* renamed from: b */
    public p260oi.C5279a0 mo11525b() {
            r2 = this;
            r0 = 0
            r2.f20488c = r0
            return r2
    }

    /* renamed from: c */
    public long mo11526c() {
            r2 = this;
            boolean r0 = r2.f20486a
            if (r0 == 0) goto L7
            long r0 = r2.f20487b
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No deadline"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: d */
    public p260oi.C5279a0 mo11527d(long r2) {
            r1 = this;
            r0 = 1
            r1.f20486a = r0
            r1.f20487b = r2
            return r1
    }

    /* renamed from: e */
    public boolean mo11528e() {
            r1 = this;
            boolean r0 = r1.f20486a
            return r0
    }

    /* renamed from: f */
    public void mo11529f() {
            r5 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L21
            boolean r0 = r5.f20486a
            if (r0 == 0) goto L20
            long r0 = r5.f20487b
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L18
            goto L20
        L18:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "deadline reached"
            r0.<init>(r1)
            throw r0
        L20:
            return
        L21:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "interrupted"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: g */
    public p260oi.C5279a0 mo11530g(long r4, java.util.concurrent.TimeUnit r6) {
            r3 = this;
            java.lang.String r0 = "unit"
            p214m2.C4339q.m9706k(r6, r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L17
            long r4 = r6.toNanos(r4)
            r3.f20488c = r4
            return r3
        L17:
            java.lang.String r6 = "timeout < 0: "
            java.lang.String r4 = p382w0.C6774a.m13748a(r6, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }
}
