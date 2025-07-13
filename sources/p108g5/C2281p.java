package p108g5;

/* renamed from: g5.p */
/* loaded from: classes.dex */
public class C2281p {

    /* renamed from: a */
    public final java.lang.Object f10415a;

    /* renamed from: b */
    public final int f10416b;

    /* renamed from: c */
    public final int f10417c;

    /* renamed from: d */
    public final long f10418d;

    /* renamed from: e */
    public final int f10419e;

    public C2281p(p108g5.C2281p r3) {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = r3.f10415a
            r2.f10415a = r0
            int r0 = r3.f10416b
            r2.f10416b = r0
            int r0 = r3.f10417c
            r2.f10417c = r0
            long r0 = r3.f10418d
            r2.f10418d = r0
            int r3 = r3.f10419e
            r2.f10419e = r3
            return
    }

    public C2281p(java.lang.Object r3) {
            r2 = this;
            r2.<init>()
            r2.f10415a = r3
            r3 = -1
            r2.f10416b = r3
            r2.f10417c = r3
            r0 = -1
            r2.f10418d = r0
            r2.f10419e = r3
            return
    }

    public C2281p(java.lang.Object r1, int r2, int r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.f10415a = r1
            r0.f10416b = r2
            r0.f10417c = r3
            r0.f10418d = r4
            r1 = -1
            r0.f10419e = r1
            return
    }

    public C2281p(java.lang.Object r1, int r2, int r3, long r4, int r6) {
            r0 = this;
            r0.<init>()
            r0.f10415a = r1
            r0.f10416b = r2
            r0.f10417c = r3
            r0.f10418d = r4
            r0.f10419e = r6
            return
    }

    public C2281p(java.lang.Object r1, long r2, int r4) {
            r0 = this;
            r0.<init>()
            r0.f10415a = r1
            r1 = -1
            r0.f10416b = r1
            r0.f10417c = r1
            r0.f10418d = r2
            r0.f10419e = r4
            return
    }

    /* renamed from: a */
    public boolean m6028a() {
            r2 = this;
            int r0 = r2.f10416b
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p108g5.C2281p
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g5.p r8 = (p108g5.C2281p) r8
            java.lang.Object r1 = r7.f10415a
            java.lang.Object r3 = r8.f10415a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L31
            int r1 = r7.f10416b
            int r3 = r8.f10416b
            if (r1 != r3) goto L31
            int r1 = r7.f10417c
            int r3 = r8.f10417c
            if (r1 != r3) goto L31
            long r3 = r7.f10418d
            long r5 = r8.f10418d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L31
            int r1 = r7.f10419e
            int r8 = r8.f10419e
            if (r1 != r8) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f10415a
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            int r1 = r3.f10416b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r3.f10417c
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.f10418d
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r3.f10419e
            int r0 = r0 + r1
            return r0
    }
}
