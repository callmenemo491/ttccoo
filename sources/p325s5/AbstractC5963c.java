package p325s5;

/* renamed from: s5.c */
/* loaded from: classes.dex */
public abstract class AbstractC5963c implements p325s5.InterfaceC5966f {

    /* renamed from: a */
    public final p108g5.C2271h0 f22928a;

    /* renamed from: b */
    public final int f22929b;

    /* renamed from: c */
    public final int[] f22930c;

    /* renamed from: d */
    public final p088f4.C2003e0[] f22931d;

    /* renamed from: e */
    public int f22932e;

    public AbstractC5963c(p108g5.C2271h0 r6, int[] r7, int r8) {
            r5 = this;
            r5.<init>()
            int r8 = r7.length
            r0 = 0
            if (r8 <= 0) goto L9
            r8 = 1
            goto La
        L9:
            r8 = 0
        La:
            p371v5.C6549a.m13291e(r8)
            java.util.Objects.requireNonNull(r6)
            r5.f22928a = r6
            int r8 = r7.length
            r5.f22929b = r8
            f4.e0[] r8 = new p088f4.C2003e0[r8]
            r5.f22931d = r8
            r8 = 0
        L1a:
            int r1 = r7.length
            if (r8 >= r1) goto L2a
            f4.e0[] r1 = r5.f22931d
            r2 = r7[r8]
            f4.e0[] r3 = r6.f10373Z
            r2 = r3[r2]
            r1[r8] = r2
            int r8 = r8 + 1
            goto L1a
        L2a:
            f4.e0[] r7 = r5.f22931d
            s5.b r8 = p325s5.C5962b.f22923Z
            java.util.Arrays.sort(r7, r8)
            int r7 = r5.f22929b
            int[] r7 = new int[r7]
            r5.f22930c = r7
            r7 = 0
        L38:
            int r8 = r5.f22929b
            if (r7 >= r8) goto L56
            int[] r8 = r5.f22930c
            f4.e0[] r1 = r5.f22931d
            r1 = r1[r7]
            r2 = 0
        L43:
            f4.e0[] r3 = r6.f10373Z
            int r4 = r3.length
            if (r2 >= r4) goto L50
            r3 = r3[r2]
            if (r1 != r3) goto L4d
            goto L51
        L4d:
            int r2 = r2 + 1
            goto L43
        L50:
            r2 = -1
        L51:
            r8[r7] = r2
            int r7 = r7 + 1
            goto L38
        L56:
            long[] r6 = new long[r8]
            return
    }

    @Override // p325s5.InterfaceC5966f
    /* renamed from: a */
    public /* synthetic */ void mo12409a(boolean r1) {
            r0 = this;
            p325s5.C5965e.m12433b(r0, r1)
            return
    }

    @Override // p325s5.InterfaceC5969i
    /* renamed from: b */
    public final p088f4.C2003e0 mo12410b(int r2) {
            r1 = this;
            f4.e0[] r0 = r1.f22931d
            r2 = r0[r2]
            return r2
    }

    @Override // p325s5.InterfaceC5966f
    /* renamed from: c */
    public void mo12405c() {
            r0 = this;
            return
    }

    @Override // p325s5.InterfaceC5969i
    /* renamed from: d */
    public final int mo12411d(int r2) {
            r1 = this;
            int[] r0 = r1.f22930c
            r2 = r0[r2]
            return r2
    }

    @Override // p325s5.InterfaceC5969i
    /* renamed from: e */
    public final p108g5.C2271h0 mo8144e() {
            r1 = this;
            g5.h0 r0 = r1.f22928a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L27
        L12:
            s5.c r5 = (p325s5.AbstractC5963c) r5
            g5.h0 r2 = r4.f22928a
            g5.h0 r3 = r5.f22928a
            if (r2 != r3) goto L25
            int[] r2 = r4.f22930c
            int[] r5 = r5.f22930c
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
        L27:
            return r1
    }

    @Override // p325s5.InterfaceC5966f
    /* renamed from: f */
    public final p088f4.C2003e0 mo12412f() {
            r2 = this;
            f4.e0[] r0 = r2.f22931d
            int r1 = r2.mo12406g()
            r0 = r0[r1]
            return r0
    }

    @Override // p325s5.InterfaceC5966f
    /* renamed from: h */
    public void mo12407h() {
            r0 = this;
            return
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f22932e
            if (r0 != 0) goto L15
            g5.h0 r0 = r2.f22928a
            int r0 = java.lang.System.identityHashCode(r0)
            int r0 = r0 * 31
            int[] r1 = r2.f22930c
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            r2.f22932e = r1
        L15:
            int r0 = r2.f22932e
            return r0
    }

    @Override // p325s5.InterfaceC5966f
    /* renamed from: i */
    public void mo12408i(float r1) {
            r0 = this;
            return
    }

    @Override // p325s5.InterfaceC5966f
    /* renamed from: j */
    public /* synthetic */ void mo12413j() {
            r0 = this;
            p325s5.C5965e.m12432a(r0)
            return
    }

    @Override // p325s5.InterfaceC5966f
    /* renamed from: k */
    public /* synthetic */ void mo12414k() {
            r0 = this;
            p325s5.C5965e.m12434c(r0)
            return
    }

    @Override // p325s5.InterfaceC5969i
    /* renamed from: l */
    public final int mo8145l(int r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.f22929b
            if (r0 >= r1) goto Lf
            int[] r1 = r2.f22930c
            r1 = r1[r0]
            if (r1 != r3) goto Lc
            return r0
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            r3 = -1
            return r3
    }

    @Override // p325s5.InterfaceC5969i
    public final int length() {
            r1 = this;
            int[] r0 = r1.f22930c
            int r0 = r0.length
            return r0
    }
}
