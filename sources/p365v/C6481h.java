package p365v;

/* renamed from: v.h */
/* loaded from: classes.dex */
public class C6481h {

    /* renamed from: m */
    public static int f25106m = 1;

    /* renamed from: a */
    public boolean f25107a;

    /* renamed from: b */
    public int f25108b;

    /* renamed from: c */
    public int f25109c;

    /* renamed from: d */
    public int f25110d;

    /* renamed from: e */
    public float f25111e;

    /* renamed from: f */
    public boolean f25112f;

    /* renamed from: g */
    public float[] f25113g;

    /* renamed from: h */
    public float[] f25114h;

    /* renamed from: i */
    public int f25115i;

    /* renamed from: j */
    public p365v.C6475b[] f25116j;

    /* renamed from: k */
    public int f25117k;

    /* renamed from: l */
    public int f25118l;

    public C6481h(int r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.f25108b = r0
            r3.f25109c = r0
            r0 = 0
            r3.f25110d = r0
            r3.f25112f = r0
            r1 = 9
            float[] r2 = new float[r1]
            r3.f25113g = r2
            float[] r1 = new float[r1]
            r3.f25114h = r1
            r1 = 16
            v.b[] r1 = new p365v.C6475b[r1]
            r3.f25116j = r1
            r3.f25117k = r0
            r3.f25118l = r0
            r3.f25115i = r4
            return
    }

    /* renamed from: a */
    public final void m13155a(p365v.C6475b r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.f25117k
            if (r0 >= r1) goto Lf
            v.b[] r1 = r3.f25116j
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            v.b[] r0 = r3.f25116j
            int r2 = r0.length
            if (r1 < r2) goto L1f
            int r1 = r0.length
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            v.b[] r0 = (p365v.C6475b[]) r0
            r3.f25116j = r0
        L1f:
            v.b[] r0 = r3.f25116j
            int r1 = r3.f25117k
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f25117k = r1
            return
    }

    /* renamed from: b */
    public final void m13156b(p365v.C6475b r5) {
            r4 = this;
            int r0 = r4.f25117k
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            v.b[] r2 = r4.f25116j
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            v.b[] r5 = r4.f25116j
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.f25117k
            int r5 = r5 + (-1)
            r4.f25117k = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
    }

    /* renamed from: c */
    public void m13157c() {
            r6 = this;
            r0 = 5
            r6.f25115i = r0
            r0 = 0
            r6.f25110d = r0
            r1 = -1
            r6.f25108b = r1
            r6.f25109c = r1
            r1 = 0
            r6.f25111e = r1
            r6.f25112f = r0
            int r2 = r6.f25117k
            r3 = 0
        L13:
            if (r3 >= r2) goto L1d
            v.b[] r4 = r6.f25116j
            r5 = 0
            r4[r3] = r5
            int r3 = r3 + 1
            goto L13
        L1d:
            r6.f25117k = r0
            r6.f25118l = r0
            r6.f25107a = r0
            float[] r0 = r6.f25114h
            java.util.Arrays.fill(r0, r1)
            return
    }

    /* renamed from: d */
    public void m13158d(p365v.C6477d r4, float r5) {
            r3 = this;
            r3.f25111e = r5
            r5 = 1
            r3.f25112f = r5
            int r5 = r3.f25117k
            r0 = -1
            r3.f25109c = r0
            r0 = 0
            r1 = 0
        Lc:
            if (r1 >= r5) goto L18
            v.b[] r2 = r3.f25116j
            r2 = r2[r1]
            r2.m13110k(r4, r3, r0)
            int r1 = r1 + 1
            goto Lc
        L18:
            r3.f25117k = r0
            return
    }

    /* renamed from: e */
    public final void m13159e(p365v.C6477d r5, p365v.C6475b r6) {
            r4 = this;
            int r0 = r4.f25117k
            r1 = 0
            r2 = 0
        L4:
            if (r2 >= r0) goto L10
            v.b[] r3 = r4.f25116j
            r3 = r3[r2]
            r3.mo13111l(r5, r6, r1)
            int r2 = r2 + 1
            goto L4
        L10:
            r4.f25117k = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r2.f25108b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
