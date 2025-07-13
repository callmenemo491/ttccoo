package p135hi;

/* renamed from: hi.a */
/* loaded from: classes.dex */
public final class C3049a {

    /* renamed from: a */
    public long f12253a;

    /* renamed from: b */
    public final p260oi.InterfaceC5286h f12254b;

    public C3049a(p260oi.InterfaceC5286h r3) {
            r2 = this;
            r2.<init>()
            r2.f12254b = r3
            r3 = 262144(0x40000, float:3.67342E-40)
            long r0 = (long) r3
            r2.f12253a = r0
            return
    }

    /* renamed from: a */
    public final bi.C0802v m7457a() {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
        L7:
            java.lang.String r1 = r10.m7458b()
            int r2 = r1.length()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 == 0) goto L2c
            bi.v r1 = new bi.v
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r0, r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r2 = 0
            r1.<init>(r0, r2)
            return r1
        L2c:
            java.lang.String r2 = "line"
            p214m2.C4339q.m9706k(r1, r2)
            r2 = 58
            r5 = 4
            int r5 = p362uh.C6467m.m13069Z(r1, r2, r3, r4, r5)
            java.lang.String r6 = "(this as java.lang.String).substring(startIndex)"
            r7 = -1
            java.lang.String r8 = "value"
            java.lang.String r9 = "name"
            if (r5 == r7) goto L68
            java.lang.String r2 = r1.substring(r4, r5)
            java.lang.String r3 = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
            p214m2.C4339q.m9705j(r2, r3)
            int r5 = r5 + 1
            java.lang.String r1 = r1.substring(r5)
            p214m2.C4339q.m9705j(r1, r6)
            p214m2.C4339q.m9706k(r2, r9)
            p214m2.C4339q.m9706k(r1, r8)
            r0.add(r2)
        L5c:
            java.lang.CharSequence r1 = p362uh.C6467m.m13083n0(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L7
        L68:
            char r4 = r1.charAt(r4)
            java.lang.String r5 = ""
            if (r4 != r2) goto L77
            java.lang.String r1 = r1.substring(r3)
            p214m2.C4339q.m9705j(r1, r6)
        L77:
            p214m2.C4339q.m9706k(r5, r9)
            p214m2.C4339q.m9706k(r1, r8)
            r0.add(r5)
            goto L5c
    }

    /* renamed from: b */
    public final java.lang.String m7458b() {
            r5 = this;
            oi.h r0 = r5.f12254b
            long r1 = r5.f12253a
            java.lang.String r0 = r0.mo11556W(r1)
            long r1 = r5.f12253a
            int r3 = r0.length()
            long r3 = (long) r3
            long r1 = r1 - r3
            r5.f12253a = r1
            return r0
    }
}
