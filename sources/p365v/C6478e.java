package p365v;

/* renamed from: v.e */
/* loaded from: classes.dex */
public class C6478e<T> implements p212m0.InterfaceC4313c {

    /* renamed from: a */
    public final /* synthetic */ int f25097a;

    /* renamed from: b */
    public final java.lang.Object[] f25098b;

    /* renamed from: c */
    public int f25099c;

    public C6478e(int r3, int r4) {
            r2 = this;
            r2.f25097a = r4
            java.lang.String r0 = "The max pool size must be > 0"
            r1 = 1
            if (r4 == r1) goto L17
            r2.<init>()
            if (r3 <= 0) goto L11
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.f25098b = r3
            return
        L11:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            throw r3
        L17:
            r2.<init>()
            if (r3 <= 0) goto L21
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.f25098b = r3
            return
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            throw r3
    }

    @Override // p212m0.InterfaceC4313c
    /* renamed from: a */
    public boolean mo6230a(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f25097a
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L16
        L8:
            int r0 = r5.f25099c
            java.lang.Object[] r3 = r5.f25098b
            int r4 = r3.length
            if (r0 >= r4) goto L15
            r3[r0] = r6
            int r0 = r0 + r2
            r5.f25099c = r0
            r1 = 1
        L15:
            return r1
        L16:
            boolean r0 = r5.m13144c(r6)
            if (r0 != 0) goto L2a
            int r0 = r5.f25099c
            java.lang.Object[] r3 = r5.f25098b
            int r4 = r3.length
            if (r0 >= r4) goto L29
            r3[r0] = r6
            int r0 = r0 + r2
            r5.f25099c = r0
            r1 = 1
        L29:
            return r1
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r6.<init>(r0)
            throw r6
    }

    @Override // p212m0.InterfaceC4313c
    /* renamed from: b */
    public java.lang.Object mo6231b() {
            r4 = this;
            int r0 = r4.f25097a
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L17
        L7:
            int r0 = r4.f25099c
            if (r0 <= 0) goto L16
            int r0 = r0 + (-1)
            java.lang.Object[] r2 = r4.f25098b
            r3 = r2[r0]
            r2[r0] = r1
            r4.f25099c = r0
            r1 = r3
        L16:
            return r1
        L17:
            int r0 = r4.f25099c
            if (r0 <= 0) goto L26
            int r0 = r0 + (-1)
            java.lang.Object[] r2 = r4.f25098b
            r3 = r2[r0]
            r2[r0] = r1
            r4.f25099c = r0
            r1 = r3
        L26:
            return r1
    }

    /* renamed from: c */
    public boolean m13144c(T r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r3.f25099c
            if (r1 >= r2) goto L11
            java.lang.Object[] r2 = r3.f25098b
            r2 = r2[r1]
            if (r2 != r4) goto Le
            r4 = 1
            return r4
        Le:
            int r1 = r1 + 1
            goto L2
        L11:
            return r0
    }
}
