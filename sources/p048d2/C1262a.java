package p048d2;

/* renamed from: d2.a */
/* loaded from: classes.dex */
public final class C1262a {

    /* renamed from: a */
    public static volatile boolean f6737a = true;

    /* renamed from: b */
    public static final p048d2.C1262a f6738b = null;

    /* renamed from: d2.a$a */
    public static final class a implements java.lang.Runnable {

        /* renamed from: Y */
        public static final p048d2.C1262a.a f6739Y = null;

        static {
                d2.a$a r0 = new d2.a$a
                r0.<init>()
                p048d2.C1262a.a.f6739Y = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r1 = this;
                d2.a r0 = p048d2.C1262a.f6738b
                r0 = 1
                p048d2.C1262a.f6737a = r0
                return
        }
    }

    static {
            d2.a r0 = new d2.a
            r0.<init>()
            p048d2.C1262a.f6738b = r0
            return
    }

    public C1262a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final boolean m3725a(android.view.View r3) {
            r2 = this;
            boolean r0 = p048d2.C1262a.f6737a
            r1 = 0
            if (r0 == 0) goto Le
            p048d2.C1262a.f6737a = r1
            d2.a$a r0 = p048d2.C1262a.a.f6739Y
            r3.post(r0)
            r3 = 1
            return r3
        Le:
            return r1
    }
}
