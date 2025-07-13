package p227n0;

/* renamed from: n0.p */
/* loaded from: classes.dex */
public final class C4657p {

    /* renamed from: a */
    public java.lang.Object f18568a;

    public C4657p(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f18568a = r1
            return
    }

    /* renamed from: a */
    public static p227n0.C4657p m10521a(android.content.Context r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L10
            n0.p r0 = new n0.p
            android.view.PointerIcon r2 = android.view.PointerIcon.getSystemIcon(r2, r3)
            r0.<init>(r2)
            return r0
        L10:
            n0.p r2 = new n0.p
            r3 = 0
            r2.<init>(r3)
            return r2
    }
}
