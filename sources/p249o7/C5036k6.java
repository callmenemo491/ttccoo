package p249o7;

/* renamed from: o7.k6 */
/* loaded from: classes.dex */
public final class C5036k6 implements p249o7.InterfaceC5017i3, p249o7.InterfaceC5100s6 {

    /* renamed from: Y */
    public final /* synthetic */ p249o7.C5052m6 f19811Y;

    public C5036k6(p249o7.C5052m6 r2, int r3) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L9
            r1.f19811Y = r2
            r1.<init>()
            return
        L9:
            r1.f19811Y = r2
            r1.<init>()
            return
    }

    @Override // p249o7.InterfaceC5100s6
    /* renamed from: a */
    public void mo11289a(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L1a
            o7.m6 r2 = r1.f19811Y
            com.google.android.gms.measurement.internal.d r2 = r2.f19871l
            if (r2 == 0) goto L19
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5672f
            java.lang.String r3 = "AppId not known when logging event"
            java.lang.String r4 = "_err"
            r2.m11170d(r3, r4)
        L19:
            return
        L1a:
            o7.m6 r3 = r1.f19811Y
            o7.f4 r3 = r3.mo3160b()
            e7.b r0 = new e7.b
            r0.<init>(r1, r2, r4)
            r3.m11176s(r0)
            return
    }

    @Override // p249o7.InterfaceC5017i3
    /* renamed from: b */
    public void mo812b(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
            r6 = this;
            o7.m6 r0 = r6.f19811Y
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.m11353l(r1, r2, r3, r4, r5)
            return
    }
}
