package p158j0;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public class C3379a {
    /* renamed from: a */
    public static boolean m7754a() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 31
            if (r0 >= r3) goto L20
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r3 = "REL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L13
            goto L1d
        L13:
            java.lang.String r3 = "S"
            int r0 = r0.compareTo(r3)
            if (r0 < 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L21
        L20:
            r1 = 1
        L21:
            return r1
    }
}
