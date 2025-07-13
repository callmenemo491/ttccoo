package p316rh;

/* renamed from: rh.e */
/* loaded from: classes.dex */
public final class C5856e extends p062dh.AbstractC1479o {

    /* renamed from: Y */
    public final long f22659Y;

    /* renamed from: Z */
    public final long f22660Z;

    /* renamed from: a0 */
    public boolean f22661a0;

    /* renamed from: b0 */
    public long f22662b0;

    public C5856e(long r6, long r8, long r10) {
            r5 = this;
            r5.<init>()
            r5.f22659Y = r10
            r5.f22660Z = r8
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L14
            if (r10 > 0) goto L17
            goto L18
        L14:
            if (r10 < 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            r5.f22661a0 = r0
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            r6 = r8
        L1e:
            r5.f22662b0 = r6
            return
    }

    @Override // p062dh.AbstractC1479o
    /* renamed from: a */
    public long mo4013a() {
            r5 = this;
            long r0 = r5.f22662b0
            long r2 = r5.f22660Z
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L16
            boolean r2 = r5.f22661a0
            if (r2 == 0) goto L10
            r2 = 0
            r5.f22661a0 = r2
            goto L1b
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L16:
            long r2 = r5.f22659Y
            long r2 = r2 + r0
            r5.f22662b0 = r2
        L1b:
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f22661a0
            return r0
    }
}
