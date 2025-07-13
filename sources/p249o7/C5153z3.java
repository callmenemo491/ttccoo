package p249o7;

/* renamed from: o7.z3 */
/* loaded from: classes.dex */
public final class C5153z3 implements p249o7.InterfaceC5100s6 {

    /* renamed from: Y */
    public final /* synthetic */ java.lang.Object f20202Y;

    public C5153z3(p249o7.C4953a4 r1) {
            r0 = this;
            r0.f20202Y = r1
            r0.<init>()
            return
    }

    public C5153z3(p249o7.C4979d5 r1) {
            r0 = this;
            r0.f20202Y = r1
            r0.<init>()
            return
    }

    @Override // p249o7.InterfaceC5100s6
    /* renamed from: a */
    public void mo11289a(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L12
            java.lang.Object r2 = r1.f20202Y
            o7.d5 r2 = (p249o7.C4979d5) r2
            java.lang.String r3 = "auto"
            java.lang.String r0 = "_err"
            r2.m11131n(r3, r0, r4)
            return
        L12:
            java.lang.Object r2 = r1.f20202Y
            o7.d5 r2 = (p249o7.C4979d5) r2
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.measurement.internal.C1113d.m3154j()
            r2 = 0
            throw r2
    }

    /* renamed from: b */
    public void m11456b(int r4, java.lang.String r5, java.util.List<java.lang.String> r6, boolean r7, boolean r8) {
            r3 = this;
            int r4 = r4 + (-1)
            r0 = 3
            r1 = 1
            if (r4 == 0) goto L55
            if (r4 == r1) goto L3e
            if (r4 == r0) goto L31
            r2 = 4
            if (r4 == r2) goto L1a
            java.lang.Object r4 = r3.f20202Y
            o7.a4 r4 = (p249o7.C4953a4) r4
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5678l
            goto L61
        L1a:
            java.lang.Object r4 = r3.f20202Y
            o7.a4 r4 = (p249o7.C4953a4) r4
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            if (r7 == 0) goto L29
            o7.f3 r4 = r4.f5676j
            goto L61
        L29:
            if (r8 != 0) goto L2e
            o7.f3 r4 = r4.f5677k
            goto L61
        L2e:
            o7.f3 r4 = r4.f5675i
            goto L61
        L31:
            java.lang.Object r4 = r3.f20202Y
            o7.a4 r4 = (p249o7.C4953a4) r4
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5680n
            goto L61
        L3e:
            java.lang.Object r4 = r3.f20202Y
            o7.a4 r4 = (p249o7.C4953a4) r4
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            if (r7 == 0) goto L4d
            o7.f3 r4 = r4.f5673g
            goto L61
        L4d:
            if (r8 != 0) goto L52
            o7.f3 r4 = r4.f5674h
            goto L61
        L52:
            o7.f3 r4 = r4.f5672f
            goto L61
        L55:
            java.lang.Object r4 = r3.f20202Y
            o7.a4 r4 = (p249o7.C4953a4) r4
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5679m
        L61:
            int r7 = r6.size()
            r8 = 0
            if (r7 == r1) goto L8d
            r2 = 2
            if (r7 == r2) goto L81
            if (r7 == r0) goto L71
            r4.m11169c(r5)
            return
        L71:
            java.lang.Object r7 = r6.get(r8)
            java.lang.Object r8 = r6.get(r1)
            java.lang.Object r6 = r6.get(r2)
            r4.m11172f(r5, r7, r8, r6)
            return
        L81:
            java.lang.Object r7 = r6.get(r8)
            java.lang.Object r6 = r6.get(r1)
            r4.m11171e(r5, r7, r6)
            return
        L8d:
            java.lang.Object r6 = r6.get(r8)
            r4.m11170d(r5, r6)
            return
    }
}
