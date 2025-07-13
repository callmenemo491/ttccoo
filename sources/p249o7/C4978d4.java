package p249o7;

/* renamed from: o7.d4 */
/* loaded from: classes.dex */
public final class C4978d4<V> extends java.util.concurrent.FutureTask<V> implements java.lang.Comparable<p249o7.C4978d4<V>> {

    /* renamed from: Y */
    public final long f19628Y;

    /* renamed from: Z */
    public final boolean f19629Z;

    /* renamed from: a0 */
    public final java.lang.String f19630a0;

    /* renamed from: b0 */
    public final /* synthetic */ p249o7.C4994f4 f19631b0;

    public C4978d4(p249o7.C4994f4 r3, java.lang.Runnable r4, boolean r5, java.lang.String r6) {
            r2 = this;
            r2.f19631b0 = r3
            r0 = 0
            r2.<init>(r4, r0)
            java.util.concurrent.atomic.AtomicLong r4 = p249o7.C4994f4.f19675k
            long r0 = r4.getAndIncrement()
            r2.f19628Y = r0
            r2.f19630a0 = r6
            r2.f19629Z = r5
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L28
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5672f
            java.lang.String r4 = "Tasks index overflow"
            r3.m11169c(r4)
        L28:
            return
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Callable<TV;>;ZLjava/lang/String;)V */
    public C4978d4(p249o7.C4994f4 r4, java.util.concurrent.Callable r5, boolean r6) {
            r3 = this;
            r3.f19631b0 = r4
            r3.<init>(r5)
            java.util.concurrent.atomic.AtomicLong r5 = p249o7.C4994f4.f19675k
            long r0 = r5.getAndIncrement()
            r3.f19628Y = r0
            java.lang.String r5 = "Task exception on worker thread"
            r3.f19630a0 = r5
            r3.f19629Z = r6
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L29
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5672f
            java.lang.String r5 = "Tasks index overflow"
            r4.m11169c(r5)
        L29:
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r7) {
            r6 = this;
            o7.d4 r7 = (p249o7.C4978d4) r7
            boolean r0 = r6.f19629Z
            boolean r1 = r7.f19629Z
            r2 = 1
            r3 = -1
            if (r0 == r1) goto Le
            if (r0 != 0) goto Ld
            goto L1a
        Ld:
            return r3
        Le:
            long r0 = r6.f19628Y
            long r4 = r7.f19628Y
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L18
            r2 = -1
            goto L1a
        L18:
            if (r7 <= 0) goto L1b
        L1a:
            return r2
        L1b:
            o7.f4 r7 = r6.f19631b0
            com.google.android.gms.measurement.internal.d r7 = r7.f5736a
            com.google.android.gms.measurement.internal.b r7 = r7.mo3162d()
            o7.f3 r7 = r7.f5673g
            long r0 = r6.f19628Y
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "Two tasks share the same index. index"
            r7.m11170d(r1, r0)
            r7 = 0
            return r7
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(java.lang.Throwable r3) {
            r2 = this;
            o7.f4 r0 = r2.f19631b0
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = r2.f19630a0
            r0.m11170d(r1, r3)
            super.setException(r3)
            return
    }
}
