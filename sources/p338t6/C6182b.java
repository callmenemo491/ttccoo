package p338t6;

@java.lang.Deprecated
/* renamed from: t6.b */
/* loaded from: classes.dex */
public class C6182b {
    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public static java.lang.String m12752a(@androidx.annotation.RecentlyNonNull android.os.PowerManager.WakeLock r2, @androidx.annotation.RecentlyNonNull java.lang.String r3) {
            int r3 = android.os.Process.myPid()
            long r0 = (long) r3
            r3 = 32
            long r0 = r0 << r3
            int r2 = java.lang.System.identityHashCode(r2)
            long r2 = (long) r2
            long r2 = r2 | r0
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L1f
            java.lang.String r3 = ""
        L1f:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            if (r0 == 0) goto L2e
            java.lang.String r2 = r2.concat(r3)
            return r2
        L2e:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            return r3
    }
}
