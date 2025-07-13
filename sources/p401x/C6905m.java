package p401x;

/* renamed from: x.m */
/* loaded from: classes.dex */
public class C6905m {

    /* renamed from: c */
    public static int f26843c;

    /* renamed from: a */
    public p401x.AbstractC6908p f26844a;

    /* renamed from: b */
    public java.util.ArrayList<p401x.AbstractC6908p> f26845b;

    public C6905m(p401x.AbstractC6908p r1, int r2) {
            r0 = this;
            r0.<init>()
            r2 = 0
            r0.f26844a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f26845b = r2
            int r2 = p401x.C6905m.f26843c
            int r2 = r2 + 1
            p401x.C6905m.f26843c = r2
            r0.f26844a = r1
            return
    }

    /* renamed from: a */
    public final long m13995a(p401x.C6898f r9, long r10) {
            r8 = this;
            x.p r0 = r9.f26822d
            boolean r1 = r0 instanceof p401x.C6903k
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.List<x.d> r1 = r9.f26829k
            int r1 = r1.size()
            r2 = 0
            r3 = r10
        Lf:
            if (r2 >= r1) goto L33
            java.util.List<x.d> r5 = r9.f26829k
            java.lang.Object r5 = r5.get(r2)
            x.d r5 = (p401x.InterfaceC6896d) r5
            boolean r6 = r5 instanceof p401x.C6898f
            if (r6 == 0) goto L30
            x.f r5 = (p401x.C6898f) r5
            x.p r6 = r5.f26822d
            if (r6 != r0) goto L24
            goto L30
        L24:
            int r6 = r5.f26824f
            long r6 = (long) r6
            long r6 = r6 + r10
            long r5 = r8.m13995a(r5, r6)
            long r3 = java.lang.Math.min(r3, r5)
        L30:
            int r2 = r2 + 1
            goto Lf
        L33:
            x.f r1 = r0.f26862i
            if (r9 != r1) goto L50
            long r1 = r0.mo13968j()
            x.f r9 = r0.f26861h
            long r10 = r10 - r1
            long r1 = r8.m13995a(r9, r10)
            long r1 = java.lang.Math.min(r3, r1)
            x.f r9 = r0.f26861h
            int r9 = r9.f26824f
            long r3 = (long) r9
            long r10 = r10 - r3
            long r3 = java.lang.Math.min(r1, r10)
        L50:
            return r3
    }

    /* renamed from: b */
    public final long m13996b(p401x.C6898f r9, long r10) {
            r8 = this;
            x.p r0 = r9.f26822d
            boolean r1 = r0 instanceof p401x.C6903k
            if (r1 == 0) goto L7
            return r10
        L7:
            java.util.List<x.d> r1 = r9.f26829k
            int r1 = r1.size()
            r2 = 0
            r3 = r10
        Lf:
            if (r2 >= r1) goto L33
            java.util.List<x.d> r5 = r9.f26829k
            java.lang.Object r5 = r5.get(r2)
            x.d r5 = (p401x.InterfaceC6896d) r5
            boolean r6 = r5 instanceof p401x.C6898f
            if (r6 == 0) goto L30
            x.f r5 = (p401x.C6898f) r5
            x.p r6 = r5.f26822d
            if (r6 != r0) goto L24
            goto L30
        L24:
            int r6 = r5.f26824f
            long r6 = (long) r6
            long r6 = r6 + r10
            long r5 = r8.m13996b(r5, r6)
            long r3 = java.lang.Math.max(r3, r5)
        L30:
            int r2 = r2 + 1
            goto Lf
        L33:
            x.f r1 = r0.f26861h
            if (r9 != r1) goto L50
            long r1 = r0.mo13968j()
            x.f r9 = r0.f26862i
            long r10 = r10 + r1
            long r1 = r8.m13996b(r9, r10)
            long r1 = java.lang.Math.max(r3, r1)
            x.f r9 = r0.f26862i
            int r9 = r9.f26824f
            long r3 = (long) r9
            long r10 = r10 - r3
            long r3 = java.lang.Math.max(r1, r10)
        L50:
            return r3
    }
}
