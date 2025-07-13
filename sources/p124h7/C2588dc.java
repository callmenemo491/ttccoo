package p124h7;

/* renamed from: h7.dc */
/* loaded from: classes.dex */
public final class C2588dc extends p124h7.AbstractC2695jb<p124h7.C2948xc> {

    /* renamed from: b */
    public final android.content.Context f11454b;

    /* renamed from: c */
    public final p124h7.C2948xc f11455c;

    /* renamed from: d */
    public final java.util.concurrent.Future<p124h7.C2623fb<p124h7.C2948xc>> f11456d;

    public C2588dc(android.content.Context r1, p124h7.C2948xc r2) {
            r0 = this;
            r0.<init>()
            r0.f11454b = r1
            r0.f11455c = r2
            java.util.concurrent.Future r1 = r0.mo6596c()
            r0.f11456d = r1
            return
    }

    /* renamed from: d */
    public static p411x9.C6985f0 m6595d(p251o9.C5180d r6, p124h7.C2644ge r7) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            java.util.Objects.requireNonNull(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            x9.c0 r1 = new x9.c0
            java.lang.String r2 = "firebase"
            r1.<init>(r7, r2)
            r0.add(r1)
            h7.se r1 = r7.f11549d0
            java.util.List<h7.qe> r1 = r1.f11911Y
            if (r1 == 0) goto L3b
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L3b
            r2 = 0
        L24:
            int r3 = r1.size()
            if (r2 >= r3) goto L3b
            x9.c0 r3 = new x9.c0
            java.lang.Object r4 = r1.get(r2)
            h7.qe r4 = (p124h7.C2824qe) r4
            r3.<init>(r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L24
        L3b:
            x9.f0 r1 = new x9.f0
            r1.<init>(r6, r0)
            x9.h0 r6 = new x9.h0
            long r2 = r7.f11553h0
            long r4 = r7.f11552g0
            r6.<init>(r2, r4)
            r1.f27271g0 = r6
            boolean r6 = r7.f11554i0
            r1.f27272h0 = r6
            v9.j0 r6 = r7.f11555j0
            r1.f27273i0 = r6
            java.util.List<h7.oe> r6 = r7.f11556k0
            java.util.List r6 = p185k7.C3828h5.m8585N(r6)
            r1.mo13475k0(r6)
            return r1
    }

    @Override // p124h7.AbstractC2695jb
    /* renamed from: c */
    public final java.util.concurrent.Future<p124h7.C2623fb<p124h7.C2948xc>> mo6596c() {
            r3 = this;
            java.util.concurrent.Future<h7.fb<h7.xc>> r0 = r3.f11456d
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.Context r0 = r3.f11454b
            h7.xc r1 = r3.f11455c
            h7.ec r2 = new h7.ec
            r2.<init>(r1, r0)
            h7.e1 r0 = p124h7.C2779o5.f11798a
            r1 = 2
            java.util.concurrent.ExecutorService r0 = r0.m6635b(r1)
            java.util.concurrent.Future r0 = r0.submit(r2)
            return r0
    }
}
