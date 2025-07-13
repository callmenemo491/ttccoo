package p353u6;

/* renamed from: u6.j */
/* loaded from: classes.dex */
public class C6347j {
    static {
            java.lang.String r0 = "\\$\\{(.*?)\\}"
            java.util.regex.Pattern.compile(r0)
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: a */
    public static java.lang.String m12998a(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            r1 = 0
        L7:
            return r1
    }

    /* renamed from: b */
    public static boolean m12999b(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }
}
