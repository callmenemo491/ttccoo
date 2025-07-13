package p353u6;

/* renamed from: u6.a */
/* loaded from: classes.dex */
public class C6338a {
    @androidx.annotation.RecentlyNullable
    @java.lang.Deprecated
    /* renamed from: a */
    public static byte[] m12988a(@androidx.annotation.RecentlyNonNull android.content.Context r1, @androidx.annotation.RecentlyNonNull java.lang.String r2) {
            w6.b r1 = p388w6.C6816c.m13887a(r1)
            android.content.Context r1 = r1.f26525a
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r0 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)
            android.content.pm.Signature[] r2 = r1.signatures
            if (r2 == 0) goto L2e
            int r2 = r2.length
            r0 = 1
            if (r2 != r0) goto L2e
            java.lang.String r2 = "SHA1"
            java.security.MessageDigest r2 = m12989b(r2)
            if (r2 == 0) goto L2e
            android.content.pm.Signature[] r1 = r1.signatures
            r0 = 0
            r1 = r1[r0]
            byte[] r1 = r1.toByteArray()
            byte[] r1 = r2.digest(r1)
            return r1
        L2e:
            r1 = 0
            return r1
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: b */
    public static java.security.MessageDigest m12989b(@androidx.annotation.RecentlyNonNull java.lang.String r2) {
            r0 = 0
        L1:
            r1 = 2
            if (r0 >= r1) goto Le
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            if (r1 == 0) goto Lb
            return r1
        Lb:
            int r0 = r0 + 1
            goto L1
        Le:
            r2 = 0
            return r2
    }
}
