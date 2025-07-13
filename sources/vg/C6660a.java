package vg;

/* renamed from: vg.a */
/* loaded from: classes.dex */
public final class C6660a {

    /* renamed from: a */
    public static java.lang.Character[] f25902a;

    static {
            java.lang.String r0 = ".zyxwvutsrqponmlkjihgfedcba543210"
            java.lang.String r1 = "<this>"
            p214m2.C4339q.m9706k(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.StringBuilder r0 = r2.reverse()
            java.lang.String r2 = "StringBuilder(this).reverse()"
            p214m2.C4339q.m9705j(r0, r2)
            java.lang.String r0 = r0.toString()
            char[] r0 = r0.toCharArray()
            java.lang.String r2 = "this as java.lang.String).toCharArray()"
            p214m2.C4339q.m9705j(r0, r2)
            p214m2.C4339q.m9706k(r0, r1)
            int r1 = r0.length
            java.lang.Character[] r1 = new java.lang.Character[r1]
            int r2 = r0.length
            r3 = 0
        L2a:
            if (r3 >= r2) goto L37
            char r4 = r0[r3]
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L2a
        L37:
            vg.C6660a.f25902a = r1
            return
    }
}
