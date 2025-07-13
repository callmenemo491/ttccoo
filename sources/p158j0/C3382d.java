package p158j0;

/* renamed from: j0.d */
/* loaded from: classes.dex */
public final class C3382d {

    /* renamed from: b */
    public static final /* synthetic */ int f14538b = 0;

    /* renamed from: a */
    public p158j0.InterfaceC3384f f14539a;

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            m7757a(r0)
            return
    }

    public C3382d(p158j0.InterfaceC3384f r1) {
            r0 = this;
            r0.<init>()
            r0.f14539a = r1
            return
    }

    /* renamed from: a */
    public static p158j0.C3382d m7757a(java.util.Locale... r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L16
            android.os.LocaleList r0 = new android.os.LocaleList
            r0.<init>(r2)
            j0.d r2 = new j0.d
            j0.g r1 = new j0.g
            r1.<init>(r0)
            r2.<init>(r1)
            return r2
        L16:
            j0.d r0 = new j0.d
            j0.e r1 = new j0.e
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p158j0.C3382d
            if (r0 == 0) goto L12
            j0.f r0 = r1.f14539a
            j0.d r2 = (p158j0.C3382d) r2
            j0.f r2 = r2.f14539a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            j0.f r0 = r1.f14539a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            j0.f r0 = r1.f14539a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
