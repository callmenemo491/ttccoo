package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e */
/* loaded from: classes.dex */
public class C1114e implements p249o7.InterfaceC5058n4 {

    /* renamed from: a */
    public final com.google.android.gms.measurement.internal.C1113d f5736a;

    public C1114e(com.google.android.gms.measurement.internal.C1113d r2, int r3) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L17
            r0 = 2
            if (r3 == r0) goto L11
            r1.<init>()
            java.lang.String r3 = "null reference"
            java.util.Objects.requireNonNull(r2, r3)
            r1.f5736a = r2
            return
        L11:
            r1.f5736a = r2
            r1.<init>()
            return
        L17:
            r1.<init>()
            r1.f5736a = r2
            return
    }

    @Override // p249o7.InterfaceC5058n4
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: b */
    public p249o7.C4994f4 mo3160b() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // p249o7.InterfaceC5058n4
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: c */
    public android.content.Context mo3161c() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // p249o7.InterfaceC5058n4
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: d */
    public com.google.android.gms.measurement.internal.C1111b mo3162d() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // p249o7.InterfaceC5058n4
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: e */
    public p353u6.InterfaceC6340c mo3163e() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // p249o7.InterfaceC5058n4
    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: f */
    public p367v1.C6488b mo3164f() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: g */
    public boolean m3181g() {
            r2 = this;
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            boolean r0 = r0.m3166h()
            if (r0 == 0) goto L1b
            com.google.android.gms.measurement.internal.d r0 = r2.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            java.lang.String r0 = r0.m3144x()
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L1b
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    /* renamed from: h */
    public void mo3182h() {
            r1 = this;
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            o7.f4 r0 = r0.mo3160b()
            r0.mo3182h()
            return
    }

    /* renamed from: i */
    public void mo3183i() {
            r1 = this;
            com.google.android.gms.measurement.internal.d r0 = r1.f5736a
            o7.f4 r0 = r0.mo3160b()
            r0.mo3183i()
            return
    }
}
