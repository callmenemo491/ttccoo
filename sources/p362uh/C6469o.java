package p362uh;

/* renamed from: uh.o */
/* loaded from: classes.dex */
public class C6469o extends p362uh.C6468n {
    /* renamed from: o0 */
    public static final java.lang.String m13084o0(java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r2, r0)
            r0 = 0
            if (r3 < 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L1e
            int r1 = r2.length()
            if (r3 <= r1) goto L14
            r3 = r1
        L14:
            java.lang.String r2 = r2.substring(r0, r3)
            java.lang.String r3 = "this as java.lang.String\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r2, r3)
            return r2
        L1e:
            java.lang.String r2 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r2 = android.support.v4.media.C0146e.m258a(r2, r3, r0)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* renamed from: p0 */
    public static final java.lang.String m13085p0(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r1, r0)
            if (r2 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L1e
            int r0 = r1.length()
            if (r2 <= r0) goto L13
            r2 = r0
        L13:
            int r0 = r0 - r2
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            p214m2.C4339q.m9705j(r1, r2)
            return r1
        L1e:
            java.lang.String r1 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r1 = android.support.v4.media.C0146e.m258a(r1, r2, r0)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }
}
