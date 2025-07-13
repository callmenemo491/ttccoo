package p162j4;

/* renamed from: j4.j */
/* loaded from: classes.dex */
public interface InterfaceC3405j {

    /* renamed from: a */
    public static final p162j4.InterfaceC3405j f14748a = null;

    /* renamed from: j4.j$a */
    public class a implements p162j4.InterfaceC3405j {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p162j4.InterfaceC3405j
        /* renamed from: a */
        public /* synthetic */ p162j4.InterfaceC3405j.b mo7808a(android.os.Looper r1, p162j4.InterfaceC3403h.a r2, p088f4.C2003e0 r3) {
                r0 = this;
                j4.j$b r1 = p162j4.C3404i.m7830a(r0, r1, r2, r3)
                return r1
        }

        @Override // p162j4.InterfaceC3405j
        /* renamed from: b */
        public p162j4.InterfaceC3400e mo7809b(android.os.Looper r2, p162j4.InterfaceC3403h.a r3, p088f4.C2003e0 r4) {
                r1 = this;
                j4.d r2 = r4.f8899m0
                if (r2 != 0) goto L6
                r2 = 0
                return r2
            L6:
                j4.p r2 = new j4.p
                j4.e$a r3 = new j4.e$a
                j4.z r4 = new j4.z
                r0 = 1
                r4.<init>(r0)
                r0 = 6001(0x1771, float:8.409E-42)
                r3.<init>(r4, r0)
                r2.<init>(r3)
                return r2
        }

        @Override // p162j4.InterfaceC3405j
        /* renamed from: c */
        public int mo7810c(p088f4.C2003e0 r1) {
                r0 = this;
                j4.d r1 = r1.f8899m0
                if (r1 == 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        @Override // p162j4.InterfaceC3405j
        /* renamed from: o */
        public /* synthetic */ void mo7818o() {
                r0 = this;
                p162j4.C3404i.m7831b(r0)
                return
        }

        @Override // p162j4.InterfaceC3405j
        public /* synthetic */ void release() {
                r0 = this;
                p162j4.C3404i.m7832c(r0)
                return
        }
    }

    /* renamed from: j4.j$b */
    public interface b {

        /* renamed from: F */
        public static final p162j4.InterfaceC3405j.b f14749F = null;

        static {
                k1.b r0 = p179k1.C3642b.f16059h0
                p162j4.InterfaceC3405j.b.f14749F = r0
                return
        }

        void release();
    }

    static {
            j4.j$a r0 = new j4.j$a
            r0.<init>()
            p162j4.InterfaceC3405j.f14748a = r0
            return
    }

    /* renamed from: a */
    p162j4.InterfaceC3405j.b mo7808a(android.os.Looper r1, p162j4.InterfaceC3403h.a r2, p088f4.C2003e0 r3);

    /* renamed from: b */
    p162j4.InterfaceC3400e mo7809b(android.os.Looper r1, p162j4.InterfaceC3403h.a r2, p088f4.C2003e0 r3);

    /* renamed from: c */
    int mo7810c(p088f4.C2003e0 r1);

    /* renamed from: o */
    void mo7818o();

    void release();
}
