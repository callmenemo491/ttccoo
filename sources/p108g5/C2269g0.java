package p108g5;

/* renamed from: g5.g0 */
/* loaded from: classes.dex */
public final class C2269g0<V> {

    /* renamed from: a */
    public int f10368a;

    /* renamed from: b */
    public final android.util.SparseArray<V> f10369b;

    /* renamed from: c */
    public final p371v5.InterfaceC6558h<V> f10370c;

    public C2269g0(p371v5.InterfaceC6558h<V> r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.f10369b = r0
            r1.f10370c = r2
            r2 = -1
            r1.f10368a = r2
            return
    }

    /* renamed from: a */
    public void m6015a(int r5, V r6) {
            r4 = this;
            int r0 = r4.f10368a
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 != r3) goto L17
            android.util.SparseArray<V> r0 = r4.f10369b
            int r0 = r0.size()
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            p371v5.C6549a.m13291e(r0)
            r4.f10368a = r1
        L17:
            android.util.SparseArray<V> r0 = r4.f10369b
            int r0 = r0.size()
            if (r0 <= 0) goto L42
            android.util.SparseArray<V> r0 = r4.f10369b
            int r3 = r0.size()
            int r3 = r3 - r2
            int r0 = r0.keyAt(r3)
            if (r5 < r0) goto L2d
            r1 = 1
        L2d:
            p371v5.C6549a.m13288b(r1)
            if (r0 != r5) goto L42
            v5.h<V> r0 = r4.f10370c
            android.util.SparseArray<V> r1 = r4.f10369b
            int r3 = r1.size()
            int r3 = r3 - r2
            java.lang.Object r1 = r1.valueAt(r3)
            r0.mo2143a(r1)
        L42:
            android.util.SparseArray<V> r0 = r4.f10369b
            r0.append(r5, r6)
            return
    }

    /* renamed from: b */
    public V m6016b(int r3) {
            r2 = this;
            int r0 = r2.f10368a
            r1 = -1
            if (r0 != r1) goto L8
            r0 = 0
        L6:
            r2.f10368a = r0
        L8:
            int r0 = r2.f10368a
            if (r0 <= 0) goto L19
            android.util.SparseArray<V> r1 = r2.f10369b
            int r0 = r1.keyAt(r0)
            if (r3 >= r0) goto L19
            int r0 = r2.f10368a
            int r0 = r0 + (-1)
            goto L6
        L19:
            int r0 = r2.f10368a
            android.util.SparseArray<V> r1 = r2.f10369b
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r0 >= r1) goto L38
            android.util.SparseArray<V> r0 = r2.f10369b
            int r1 = r2.f10368a
            int r1 = r1 + 1
            int r0 = r0.keyAt(r1)
            if (r3 < r0) goto L38
            int r0 = r2.f10368a
            int r0 = r0 + 1
            r2.f10368a = r0
            goto L19
        L38:
            android.util.SparseArray<V> r3 = r2.f10369b
            int r0 = r2.f10368a
            java.lang.Object r3 = r3.valueAt(r0)
            return r3
    }

    /* renamed from: c */
    public V m6017c() {
            r2 = this;
            android.util.SparseArray<V> r0 = r2.f10369b
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.valueAt(r1)
            return r0
    }
}
