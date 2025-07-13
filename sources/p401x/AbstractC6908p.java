package p401x;

/* renamed from: x.p */
/* loaded from: classes.dex */
public abstract class AbstractC6908p implements p401x.InterfaceC6896d {

    /* renamed from: a */
    public int f26854a;

    /* renamed from: b */
    public p381w.C6765f f26855b;

    /* renamed from: c */
    public p401x.C6905m f26856c;

    /* renamed from: d */
    public p381w.C6765f.a f26857d;

    /* renamed from: e */
    public p401x.C6899g f26858e;

    /* renamed from: f */
    public int f26859f;

    /* renamed from: g */
    public boolean f26860g;

    /* renamed from: h */
    public p401x.C6898f f26861h;

    /* renamed from: i */
    public p401x.C6898f f26862i;

    /* renamed from: j */
    public int f26863j;

    public AbstractC6908p(p381w.C6765f r2) {
            r1 = this;
            r1.<init>()
            x.g r0 = new x.g
            r0.<init>(r1)
            r1.f26858e = r0
            r0 = 0
            r1.f26859f = r0
            r1.f26860g = r0
            x.f r0 = new x.f
            r0.<init>(r1)
            r1.f26861h = r0
            x.f r0 = new x.f
            r0.<init>(r1)
            r1.f26862i = r0
            r0 = 1
            r1.f26863j = r0
            r1.f26855b = r2
            return
    }

    @Override // p401x.InterfaceC6896d
    /* renamed from: a */
    public void mo13964a(p401x.InterfaceC6896d r1) {
            r0 = this;
            return
    }

    /* renamed from: b */
    public final void m14002b(p401x.C6898f r2, p401x.C6898f r3, int r4) {
            r1 = this;
            java.util.List<x.f> r0 = r2.f26830l
            r0.add(r3)
            r2.f26824f = r4
            java.util.List<x.d> r3 = r3.f26829k
            r3.add(r2)
            return
    }

    /* renamed from: c */
    public final void m14003c(p401x.C6898f r3, p401x.C6898f r4, int r5, p401x.C6899g r6) {
            r2 = this;
            java.util.List<x.f> r0 = r3.f26830l
            r0.add(r4)
            java.util.List<x.f> r0 = r3.f26830l
            x.g r1 = r2.f26858e
            r0.add(r1)
            r3.f26826h = r5
            r3.f26827i = r6
            java.util.List<x.d> r4 = r4.f26829k
            r4.add(r3)
            java.util.List<x.d> r4 = r6.f26829k
            r4.add(r3)
            return
    }

    /* renamed from: d */
    public abstract void mo13965d();

    /* renamed from: e */
    public abstract void mo13966e();

    /* renamed from: f */
    public abstract void mo13967f();

    /* renamed from: g */
    public final int m14004g(int r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L15
            w.f r3 = r1.f26855b
            int r0 = r3.f26167p
            int r3 = r3.f26165o
            int r3 = java.lang.Math.max(r3, r2)
            if (r0 <= 0) goto L12
            int r3 = java.lang.Math.min(r0, r2)
        L12:
            if (r3 == r2) goto L28
            goto L27
        L15:
            w.f r3 = r1.f26855b
            int r0 = r3.f26173s
            int r3 = r3.f26171r
            int r3 = java.lang.Math.max(r3, r2)
            if (r0 <= 0) goto L25
            int r3 = java.lang.Math.min(r0, r2)
        L25:
            if (r3 == r2) goto L28
        L27:
            r2 = r3
        L28:
            return r2
    }

    /* renamed from: h */
    public final p401x.C6898f m14005h(p381w.C6763d r4) {
            r3 = this;
            w.d r4 = r4.f26091f
            r0 = 0
            if (r4 != 0) goto L6
            return r0
        L6:
            w.f r1 = r4.f26089d
            w.d$a r4 = r4.f26090e
            int r4 = r4.ordinal()
            r2 = 1
            if (r4 == r2) goto L2e
            r2 = 2
            if (r4 == r2) goto L2b
            r2 = 3
            if (r4 == r2) goto L26
            r2 = 4
            if (r4 == r2) goto L23
            r2 = 5
            if (r4 == r2) goto L1e
            goto L32
        L1e:
            x.n r4 = r1.f26145e
            x.f r0 = r4.f26846k
            goto L32
        L23:
            x.n r4 = r1.f26145e
            goto L28
        L26:
            x.l r4 = r1.f26143d
        L28:
            x.f r0 = r4.f26862i
            goto L32
        L2b:
            x.n r4 = r1.f26145e
            goto L30
        L2e:
            x.l r4 = r1.f26143d
        L30:
            x.f r0 = r4.f26861h
        L32:
            return r0
    }

    /* renamed from: i */
    public final p401x.C6898f m14006i(p381w.C6763d r3, int r4) {
            r2 = this;
            w.d r3 = r3.f26091f
            r0 = 0
            if (r3 != 0) goto L6
            return r0
        L6:
            w.f r1 = r3.f26089d
            if (r4 != 0) goto Ld
            x.l r4 = r1.f26143d
            goto Lf
        Ld:
            x.n r4 = r1.f26145e
        Lf:
            w.d$a r3 = r3.f26090e
            int r3 = r3.ordinal()
            r1 = 1
            if (r3 == r1) goto L25
            r1 = 2
            if (r3 == r1) goto L25
            r1 = 3
            if (r3 == r1) goto L22
            r1 = 4
            if (r3 == r1) goto L22
            goto L27
        L22:
            x.f r0 = r4.f26862i
            goto L27
        L25:
            x.f r0 = r4.f26861h
        L27:
            return r0
    }

    /* renamed from: j */
    public long mo13968j() {
            r2 = this;
            x.g r0 = r2.f26858e
            boolean r1 = r0.f26828j
            if (r1 == 0) goto La
            int r0 = r0.f26825g
            long r0 = (long) r0
            return r0
        La:
            r0 = 0
            return r0
    }

    /* renamed from: k */
    public abstract boolean mo13969k();

    /* renamed from: l */
    public void m14007l(p381w.C6763d r18, p381w.C6763d r19, int r20) {
            r17 = this;
            r0 = r17
            r1 = r20
            x.f r2 = r17.m14005h(r18)
            r3 = r19
            x.f r4 = r0.m14005h(r3)
            boolean r5 = r2.f26828j
            if (r5 == 0) goto Lfa
            boolean r5 = r4.f26828j
            if (r5 != 0) goto L18
            goto Lfa
        L18:
            int r5 = r2.f26825g
            int r6 = r18.m13681d()
            int r6 = r6 + r5
            int r5 = r4.f26825g
            int r3 = r19.m13681d()
            int r5 = r5 - r3
            int r3 = r5 - r6
            x.g r7 = r0.f26858e
            boolean r8 = r7.f26828j
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r8 != 0) goto Lb5
            w.f$a r8 = r0.f26857d
            w.f$a r10 = p381w.C6765f.a.f26191a0
            if (r8 != r10) goto Lb5
            int r8 = r0.f26854a
            if (r8 == 0) goto Lad
            r11 = 1
            if (r8 == r11) goto L9b
            r12 = 2
            if (r8 == r12) goto L79
            r12 = 3
            if (r8 == r12) goto L45
            goto Lb5
        L45:
            w.f r8 = r0.f26855b
            x.l r13 = r8.f26143d
            w.f$a r14 = r13.f26857d
            if (r14 != r10) goto L5c
            int r14 = r13.f26854a
            if (r14 != r12) goto L5c
            x.n r14 = r8.f26145e
            w.f$a r15 = r14.f26857d
            if (r15 != r10) goto L5c
            int r10 = r14.f26854a
            if (r10 != r12) goto L5c
            goto Lb5
        L5c:
            if (r1 != 0) goto L60
            x.n r13 = r8.f26145e
        L60:
            x.g r10 = r13.f26858e
            boolean r12 = r10.f26828j
            if (r12 == 0) goto Lb5
            float r8 = r8.f26131U
            if (r1 != r11) goto L71
            int r10 = r10.f26825g
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r10 + r9
            int r8 = (int) r10
            goto Lb2
        L71:
            int r10 = r10.f26825g
            float r10 = (float) r10
            float r8 = r8 * r10
            float r8 = r8 + r9
            int r8 = (int) r8
            goto Lb2
        L79:
            w.f r8 = r0.f26855b
            w.f r10 = r8.f26128R
            if (r10 == 0) goto Lb5
            if (r1 != 0) goto L84
            x.l r10 = r10.f26143d
            goto L86
        L84:
            x.n r10 = r10.f26145e
        L86:
            x.g r10 = r10.f26858e
            boolean r11 = r10.f26828j
            if (r11 == 0) goto Lb5
            if (r1 != 0) goto L91
            float r8 = r8.f26169q
            goto L93
        L91:
            float r8 = r8.f26175t
        L93:
            int r10 = r10.f26825g
            float r10 = (float) r10
            float r10 = r10 * r8
            float r10 = r10 + r9
            int r8 = (int) r10
            goto Lae
        L9b:
            int r7 = r7.f26840m
            int r7 = r0.m14004g(r7, r1)
            x.g r8 = r0.f26858e
            int r7 = java.lang.Math.min(r7, r3)
            r16 = r8
            r8 = r7
            r7 = r16
            goto Lb2
        Lad:
            r8 = r3
        Lae:
            int r8 = r0.m14004g(r8, r1)
        Lb2:
            r7.mo13980c(r8)
        Lb5:
            x.g r7 = r0.f26858e
            boolean r8 = r7.f26828j
            if (r8 != 0) goto Lbc
            return
        Lbc:
            int r7 = r7.f26825g
            if (r7 != r3) goto Lcb
            x.f r1 = r0.f26861h
            r1.mo13980c(r6)
            x.f r1 = r0.f26862i
            r1.mo13980c(r5)
            return
        Lcb:
            if (r1 != 0) goto Ld2
            w.f r1 = r0.f26855b
            float r1 = r1.f26148f0
            goto Ld6
        Ld2:
            w.f r1 = r0.f26855b
            float r1 = r1.f26150g0
        Ld6:
            if (r2 != r4) goto Lde
            int r6 = r2.f26825g
            int r5 = r4.f26825g
            r1 = 1056964608(0x3f000000, float:0.5)
        Lde:
            int r5 = r5 - r6
            int r5 = r5 - r7
            x.f r2 = r0.f26861h
            float r3 = (float) r6
            float r3 = r3 + r9
            float r4 = (float) r5
            float r4 = r4 * r1
            float r4 = r4 + r3
            int r1 = (int) r4
            r2.mo13980c(r1)
            x.f r1 = r0.f26862i
            x.f r2 = r0.f26861h
            int r2 = r2.f26825g
            x.g r3 = r0.f26858e
            int r3 = r3.f26825g
            int r2 = r2 + r3
            r1.mo13980c(r2)
        Lfa:
            return
    }
}
