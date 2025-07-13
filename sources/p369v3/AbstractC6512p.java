package p369v3;

@com.google.auto.value.AutoValue
/* renamed from: v3.p */
/* loaded from: classes.dex */
public abstract class AbstractC6512p {

    /* renamed from: v3.p$a */
    public enum a extends java.lang.Enum<p369v3.AbstractC6512p.a> {

        /* renamed from: Y */
        public static final p369v3.AbstractC6512p.a f25255Y = null;

        /* renamed from: Z */
        public static final /* synthetic */ p369v3.AbstractC6512p.a[] f25256Z = null;

        static {
                v3.p$a r0 = new v3.p$a
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                v3.p$a r1 = new v3.p$a
                java.lang.String r3 = "ANDROID_FIREBASE"
                r4 = 1
                r5 = 23
                r1.<init>(r3, r4, r5)
                p369v3.AbstractC6512p.a.f25255Y = r1
                r3 = 2
                v3.p$a[] r3 = new p369v3.AbstractC6512p.a[r3]
                r3[r2] = r0
                r3[r4] = r1
                p369v3.AbstractC6512p.a.f25256Z = r3
                return
        }

        a(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p369v3.AbstractC6512p.a valueOf(java.lang.String r1) {
                java.lang.Class<v3.p$a> r0 = p369v3.AbstractC6512p.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                v3.p$a r1 = (p369v3.AbstractC6512p.a) r1
                return r1
        }

        public static p369v3.AbstractC6512p.a[] values() {
                v3.p$a[] r0 = p369v3.AbstractC6512p.a.f25256Z
                java.lang.Object r0 = r0.clone()
                v3.p$a[] r0 = (p369v3.AbstractC6512p.a[]) r0
                return r0
        }
    }

    public AbstractC6512p() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract p369v3.AbstractC6497a mo13221a();

    /* renamed from: b */
    public abstract p369v3.AbstractC6512p.a mo13222b();
}
