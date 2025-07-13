package p333t1;

/* renamed from: t1.p */
/* loaded from: classes.dex */
public class C6112p {

    /* renamed from: a */
    public static boolean f23624a = true;

    /* renamed from: a */
    public static void m12638a(android.view.ViewGroup r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            r2.suppressLayout(r3)
            goto L15
        La:
            boolean r0 = p333t1.C6112p.f23624a
            if (r0 == 0) goto L15
            r2.suppressLayout(r3)     // Catch: java.lang.NoSuchMethodError -> L12
            goto L15
        L12:
            r2 = 0
            p333t1.C6112p.f23624a = r2
        L15:
            return
    }
}
