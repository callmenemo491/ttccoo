package p238nd;

/* renamed from: nd.q */
/* loaded from: classes.dex */
public final class C4770q {

    /* renamed from: a */
    @android.annotation.SuppressLint({"StaticFieldLeak"})
    public static volatile p238nd.C4770q f19093a;

    public C4770q(android.content.Context r7, p238nd.C4753j1 r8, p239nh.C4826f r9) {
            r6 = this;
            r6.<init>()
            vh.v0 r0 = p379vh.C6746v0.f26044Y
            nd.p r3 = new nd.p
            r7 = 0
            r3.<init>(r7)
            r1 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            p101fh.C2174f.m5728r(r0, r1, r2, r3, r4, r5)
            return
    }

    /* renamed from: a */
    public static java.lang.String m10831a(p238nd.C4770q r3, java.lang.Double r4, boolean r5, int r6, int r7) {
            r3 = r7 & 2
            r0 = 0
            if (r3 == 0) goto L6
            r5 = 0
        L6:
            r3 = r7 & 4
            r7 = 2
            if (r3 == 0) goto Lc
            r6 = 2
        Lc:
            r3 = 0
            if (r4 == 0) goto L2a
            r4.doubleValue()
            nd.b0$a r1 = p238nd.C4728b0.f18900D
            nd.b0 r1 = r1.m10809a()
            java.lang.Double r1 = r1.f18926v
            if (r1 == 0) goto L2a
            double r1 = r1.doubleValue()
            double r3 = r4.doubleValue()
            double r3 = r3 * r1
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
        L2a:
            if (r3 == 0) goto L51
            r1 = 0
            boolean r4 = p214m2.C4339q.m9701a(r3, r1)
            if (r4 == 0) goto L37
            if (r5 != 0) goto L37
            goto L51
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            double r1 = r3.doubleValue()
            java.lang.String r3 = vg.C6672m.m13535v(r1, r6, r0, r7)
            r4.append(r3)
            java.lang.String r3 = " $"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L53
        L51:
            java.lang.String r3 = "-- $"
        L53:
            return r3
    }
}
