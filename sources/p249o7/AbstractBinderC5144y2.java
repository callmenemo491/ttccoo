package p249o7;

/* renamed from: o7.y2 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5144y2 extends p185k7.BinderC3753c0 implements p249o7.InterfaceC5152z2 {
    public AbstractBinderC5144y2() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IMeasurementService"
            r1.<init>(r0)
            return
    }

    @Override // p185k7.BinderC3753c0
    /* renamed from: v */
    public final boolean mo8231v(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
            r8 = this;
            r12 = 0
            java.lang.String r0 = "null reference"
            r1 = 1
            switch(r9) {
                case 1: goto L24d;
                case 2: goto L22b;
                case 3: goto L7;
                case 4: goto L213;
                case 5: goto L1ef;
                case 6: goto L1d7;
                case 7: goto L15b;
                case 8: goto L7;
                case 9: goto L140;
                case 10: goto L128;
                case 11: goto L111;
                case 12: goto Lf9;
                case 13: goto Lcd;
                case 14: goto La5;
                case 15: goto L88;
                case 16: goto L70;
                case 17: goto L5c;
                case 18: goto L3d;
                case 19: goto L18;
                case 20: goto L8;
                default: goto L7;
            }
        L7:
            return r12
        L8:
            android.os.Parcelable$Creator<o7.u6> r9 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.u6 r9 = (p249o7.C5116u6) r9
            r10 = r8
            o7.l4 r10 = (p249o7.BinderC5042l4) r10
            r10.mo11298W0(r9)
            goto L26e
        L18:
            android.os.Parcelable$Creator r9 = android.os.Bundle.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            android.os.Bundle r9 = (android.os.Bundle) r9
            android.os.Parcelable$Creator<o7.u6> r12 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r10 = p185k7.C3767d0.m8366a(r10, r12)
            o7.u6 r10 = (p249o7.C5116u6) r10
            r12 = r8
            o7.l4 r12 = (p249o7.BinderC5042l4) r12
            r12.m11305k2(r10)
            java.lang.String r10 = r10.f20031Y
            java.util.Objects.requireNonNull(r10, r0)
            c6.h0 r0 = new c6.h0
            r0.<init>(r12, r10, r9)
            r12.m11294H(r0)
            goto L26e
        L3d:
            android.os.Parcelable$Creator<o7.u6> r9 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.u6 r9 = (p249o7.C5116u6) r9
            r10 = r8
            o7.l4 r10 = (p249o7.BinderC5042l4) r10
            java.lang.String r0 = r9.f20031Y
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            java.lang.String r0 = r9.f20031Y
            r10.m11310x(r0, r12)
            o7.i4 r0 = new o7.i4
            r0.<init>(r10, r9, r12)
            r10.m11294H(r0)
            goto L26e
        L5c:
            java.lang.String r9 = r10.readString()
            java.lang.String r12 = r10.readString()
            java.lang.String r10 = r10.readString()
            r0 = r8
            o7.l4 r0 = (p249o7.BinderC5042l4) r0
            java.util.List r9 = r0.mo11303b1(r9, r12, r10)
            goto Lc5
        L70:
            java.lang.String r9 = r10.readString()
            java.lang.String r12 = r10.readString()
            android.os.Parcelable$Creator<o7.u6> r0 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r10 = p185k7.C3767d0.m8366a(r10, r0)
            o7.u6 r10 = (p249o7.C5116u6) r10
            r0 = r8
            o7.l4 r0 = (p249o7.BinderC5042l4) r0
            java.util.List r9 = r0.mo11302a2(r9, r12, r10)
            goto Lc5
        L88:
            java.lang.String r9 = r10.readString()
            java.lang.String r0 = r10.readString()
            java.lang.String r2 = r10.readString()
            java.lang.ClassLoader r3 = p185k7.C3767d0.f16553a
            int r10 = r10.readInt()
            if (r10 == 0) goto L9d
            r12 = 1
        L9d:
            r10 = r8
            o7.l4 r10 = (p249o7.BinderC5042l4) r10
            java.util.List r9 = r10.mo11307p0(r9, r0, r2, r12)
            goto Lc5
        La5:
            java.lang.String r9 = r10.readString()
            java.lang.String r0 = r10.readString()
            java.lang.ClassLoader r2 = p185k7.C3767d0.f16553a
            int r2 = r10.readInt()
            if (r2 == 0) goto Lb6
            r12 = 1
        Lb6:
            android.os.Parcelable$Creator<o7.u6> r2 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r10 = p185k7.C3767d0.m8366a(r10, r2)
            o7.u6 r10 = (p249o7.C5116u6) r10
            r2 = r8
            o7.l4 r2 = (p249o7.BinderC5042l4) r2
            java.util.List r9 = r2.mo11311x1(r9, r0, r12, r10)
        Lc5:
            r11.writeNoException()
            r11.writeTypedList(r9)
            goto L271
        Lcd:
            android.os.Parcelable$Creator<o7.b> r9 = p249o7.C4957b.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.b r9 = (p249o7.C4957b) r9
            r10 = r8
            o7.l4 r10 = (p249o7.BinderC5042l4) r10
            java.util.Objects.requireNonNull(r9, r0)
            o7.p6 r12 = r9.f19589a0
            java.util.Objects.requireNonNull(r12, r0)
            java.lang.String r12 = r9.f19587Y
            com.google.android.gms.common.internal.C1101a.m3100e(r12)
            java.lang.String r12 = r9.f19587Y
            r10.m11310x(r12, r1)
            o7.b r12 = new o7.b
            r12.<init>(r9)
            h6.a0 r9 = new h6.a0
            r9.<init>(r10, r12)
            r10.m11294H(r9)
            goto L26e
        Lf9:
            android.os.Parcelable$Creator<o7.b> r9 = p249o7.C4957b.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.b r9 = (p249o7.C4957b) r9
            android.os.Parcelable$Creator<o7.u6> r12 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r10 = p185k7.C3767d0.m8366a(r10, r12)
            o7.u6 r10 = (p249o7.C5116u6) r10
            r12 = r8
            o7.l4 r12 = (p249o7.BinderC5042l4) r12
            r12.mo11301X1(r9, r10)
            goto L26e
        L111:
            android.os.Parcelable$Creator<o7.u6> r9 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.u6 r9 = (p249o7.C5116u6) r9
            r10 = r8
            o7.l4 r10 = (p249o7.BinderC5042l4) r10
            java.lang.String r9 = r10.mo11309t1(r9)
            r11.writeNoException()
            r11.writeString(r9)
            goto L271
        L128:
            long r3 = r10.readLong()
            java.lang.String r5 = r10.readString()
            java.lang.String r6 = r10.readString()
            java.lang.String r7 = r10.readString()
            r2 = r8
            o7.l4 r2 = (p249o7.BinderC5042l4) r2
            r2.mo11297S(r3, r5, r6, r7)
            goto L26e
        L140:
            android.os.Parcelable$Creator<o7.q> r9 = p249o7.C5077q.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.q r9 = (p249o7.C5077q) r9
            java.lang.String r10 = r10.readString()
            r12 = r8
            o7.l4 r12 = (p249o7.BinderC5042l4) r12
            byte[] r9 = r12.mo11308q0(r9, r10)
            r11.writeNoException()
            r11.writeByteArray(r9)
            goto L271
        L15b:
            android.os.Parcelable$Creator<o7.u6> r9 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.u6 r9 = (p249o7.C5116u6) r9
            int r10 = r10.readInt()
            if (r10 == 0) goto L16a
            r12 = 1
        L16a:
            r10 = r8
            o7.l4 r10 = (p249o7.BinderC5042l4) r10
            r10.m11305k2(r9)
            java.lang.String r2 = r9.f20031Y
            java.util.Objects.requireNonNull(r2, r0)
            o7.m6 r0 = r10.f19823a
            o7.f4 r0 = r0.mo3160b()
            o7.j4 r3 = new o7.j4
            r3.<init>(r10, r2)
            java.util.concurrent.Future r0 = r0.m11174q(r3)
            java.util.concurrent.FutureTask r0 = (java.util.concurrent.FutureTask) r0     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            java.lang.Object r0 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            java.util.List r0 = (java.util.List) r0     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            int r3 = r0.size()     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            r2.<init>(r3)     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            java.util.Iterator r0 = r0.iterator()     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
        L199:
            boolean r3 = r0.hasNext()     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            if (r3 == 0) goto L1cf
            java.lang.Object r3 = r0.next()     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            o7.r6 r3 = (p249o7.C5092r6) r3     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            if (r12 != 0) goto L1af
            java.lang.String r4 = r3.f19982c     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            boolean r4 = com.google.android.gms.measurement.internal.C1115f.m3184V(r4)     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            if (r4 != 0) goto L199
        L1af:
            o7.p6 r4 = new o7.p6     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            r4.<init>(r3)     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            r2.add(r4)     // Catch: java.util.concurrent.ExecutionException -> L1b8 java.lang.InterruptedException -> L1ba
            goto L199
        L1b8:
            r12 = move-exception
            goto L1bb
        L1ba:
            r12 = move-exception
        L1bb:
            o7.m6 r10 = r10.f19823a
            com.google.android.gms.measurement.internal.b r10 = r10.mo3162d()
            o7.f3 r10 = r10.f5672f
            java.lang.String r9 = r9.f20031Y
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1111b.m3134u(r9)
            java.lang.String r0 = "Failed to get user properties. appId"
            r10.m11171e(r0, r9, r12)
            r2 = 0
        L1cf:
            r11.writeNoException()
            r11.writeTypedList(r2)
            goto L271
        L1d7:
            android.os.Parcelable$Creator<o7.u6> r9 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.u6 r9 = (p249o7.C5116u6) r9
            r10 = r8
            o7.l4 r10 = (p249o7.BinderC5042l4) r10
            r10.m11305k2(r9)
            o7.i4 r12 = new o7.i4
            r12.<init>(r10, r9, r1)
            r10.m11294H(r12)
            goto L26e
        L1ef:
            android.os.Parcelable$Creator<o7.q> r9 = p249o7.C5077q.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.q r9 = (p249o7.C5077q) r9
            java.lang.String r12 = r10.readString()
            r10.readString()
            r10 = r8
            o7.l4 r10 = (p249o7.BinderC5042l4) r10
            java.util.Objects.requireNonNull(r9, r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r12)
            r10.m11310x(r12, r1)
            c6.h0 r0 = new c6.h0
            r0.<init>(r10, r9, r12)
            r10.m11294H(r0)
            goto L26e
        L213:
            android.os.Parcelable$Creator<o7.u6> r9 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.u6 r9 = (p249o7.C5116u6) r9
            r10 = r8
            o7.l4 r10 = (p249o7.BinderC5042l4) r10
            r10.m11305k2(r9)
            o7.i4 r12 = new o7.i4
            r0 = 3
            r12.<init>(r10, r9, r0)
            r10.m11294H(r12)
            goto L26e
        L22b:
            android.os.Parcelable$Creator<o7.p6> r9 = p249o7.C5076p6.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.p6 r9 = (p249o7.C5076p6) r9
            android.os.Parcelable$Creator<o7.u6> r12 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r10 = p185k7.C3767d0.m8366a(r10, r12)
            o7.u6 r10 = (p249o7.C5116u6) r10
            r12 = r8
            o7.l4 r12 = (p249o7.BinderC5042l4) r12
            java.util.Objects.requireNonNull(r9, r0)
            r12.m11305k2(r10)
            c6.h0 r0 = new c6.h0
            r0.<init>(r12, r9, r10)
            r12.m11294H(r0)
            goto L26e
        L24d:
            android.os.Parcelable$Creator<o7.q> r9 = p249o7.C5077q.CREATOR
            android.os.Parcelable r9 = p185k7.C3767d0.m8366a(r10, r9)
            o7.q r9 = (p249o7.C5077q) r9
            android.os.Parcelable$Creator<o7.u6> r12 = p249o7.C5116u6.CREATOR
            android.os.Parcelable r10 = p185k7.C3767d0.m8366a(r10, r12)
            o7.u6 r10 = (p249o7.C5116u6) r10
            r12 = r8
            o7.l4 r12 = (p249o7.BinderC5042l4) r12
            java.util.Objects.requireNonNull(r9, r0)
            r12.m11305k2(r10)
            c6.h0 r0 = new c6.h0
            r0.<init>(r12, r9, r10)
            r12.m11294H(r0)
        L26e:
            r11.writeNoException()
        L271:
            return r1
    }
}
