package p011aa;

/* renamed from: aa.b */
/* loaded from: classes.dex */
public final class C0046b implements p011aa.InterfaceC0045a {

    /* renamed from: c */
    public static final p011aa.InterfaceC0048d f98c = null;

    /* renamed from: a */
    public final p392wa.InterfaceC6822a<p011aa.InterfaceC0045a> f99a;

    /* renamed from: b */
    public final java.util.concurrent.atomic.AtomicReference<p011aa.InterfaceC0045a> f100b;

    /* renamed from: aa.b$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: aa.b$b */
    public static final class b implements p011aa.InterfaceC0048d {
        public b(p011aa.C0046b.a r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            aa.b$b r0 = new aa.b$b
            r1 = 0
            r0.<init>(r1)
            p011aa.C0046b.f98c = r0
            return
    }

    public C0046b(p392wa.InterfaceC6822a<p011aa.InterfaceC0045a> r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r2.f100b = r0
            r2.f99a = r3
            u3.b r0 = new u3.b
            r0.<init>(r2)
            y9.r r3 = (p432y9.C7151r) r3
            r3.m14265a(r0)
            return
    }

    @Override // p011aa.InterfaceC0045a
    /* renamed from: a */
    public void mo45a(java.lang.String r4) {
            r3 = this;
            wa.a<aa.a> r0 = r3.f99a
            k1.e r1 = new k1.e
            r2 = 2
            r1.<init>(r4, r2)
            y9.r r0 = (p432y9.C7151r) r0
            r0.m14265a(r1)
            return
    }

    @Override // p011aa.InterfaceC0045a
    /* renamed from: b */
    public p011aa.InterfaceC0048d mo46b(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<aa.a> r0 = r1.f100b
            java.lang.Object r0 = r0.get()
            aa.a r0 = (p011aa.InterfaceC0045a) r0
            if (r0 != 0) goto Ld
            aa.d r2 = p011aa.C0046b.f98c
            goto L11
        Ld:
            aa.d r2 = r0.mo46b(r2)
        L11:
            return r2
    }

    @Override // p011aa.InterfaceC0045a
    /* renamed from: c */
    public boolean mo47c() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<aa.a> r0 = r1.f100b
            java.lang.Object r0 = r0.get()
            aa.a r0 = (p011aa.InterfaceC0045a) r0
            if (r0 == 0) goto L12
            boolean r0 = r0.mo47c()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // p011aa.InterfaceC0045a
    /* renamed from: d */
    public void mo48d(java.lang.String r9, java.lang.String r10, long r11, p094fa.AbstractC2107c0 r13) {
            r8 = this;
            java.lang.String r0 = "Deferring native open session: "
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r9)
            r1 = 2
            java.lang.String r2 = "FirebaseCrashlytics"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L13
            r1 = 0
            android.util.Log.v(r2, r0, r1)
        L13:
            wa.a<aa.a> r0 = r8.f99a
            a4.g r7 = new a4.g
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r6)
            y9.r r0 = (p432y9.C7151r) r0
            r0.m14265a(r7)
            return
    }

    @Override // p011aa.InterfaceC0045a
    /* renamed from: e */
    public boolean mo49e(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<aa.a> r0 = r1.f100b
            java.lang.Object r0 = r0.get()
            aa.a r0 = (p011aa.InterfaceC0045a) r0
            if (r0 == 0) goto L12
            boolean r2 = r0.mo49e(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }
}
