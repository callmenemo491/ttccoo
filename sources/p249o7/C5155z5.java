package p249o7;

import android.content.Context;
import p249o7.InterfaceC5147y5;

/* renamed from: o7.z5 */
/* loaded from: classes.dex */
public final class C5155z5<T extends android.content.Context & p249o7.InterfaceC5147y5> {

    /* renamed from: a */
    public final T f20206a;

    public C5155z5(T r1) {
            r0 = this;
            r0.<init>()
            r0.f20206a = r1
            return
    }

    /* renamed from: a */
    public final void m11458a(android.content.Intent r3) {
            r2 = this;
            if (r3 != 0) goto Le
            com.google.android.gms.measurement.internal.b r3 = r2.m11460c()
            o7.f3 r3 = r3.f5672f
            java.lang.String r0 = "onRebind called with null intent"
            r3.m11169c(r0)
            return
        Le:
            java.lang.String r3 = r3.getAction()
            com.google.android.gms.measurement.internal.b r0 = r2.m11460c()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "onRebind called. action"
            r0.m11170d(r1, r3)
            return
    }

    /* renamed from: b */
    public final boolean m11459b(android.content.Intent r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto Lf
            com.google.android.gms.measurement.internal.b r4 = r3.m11460c()
            o7.f3 r4 = r4.f5672f
            java.lang.String r1 = "onUnbind called with null intent"
            r4.m11169c(r1)
            return r0
        Lf:
            java.lang.String r4 = r4.getAction()
            com.google.android.gms.measurement.internal.b r1 = r3.m11460c()
            o7.f3 r1 = r1.f5680n
            java.lang.String r2 = "onUnbind called for intent. action"
            r1.m11170d(r2, r4)
            return r0
    }

    /* renamed from: c */
    public final com.google.android.gms.measurement.internal.C1111b m11460c() {
            r2 = this;
            T extends android.content.Context & o7.y5 r0 = r2.f20206a
            r1 = 0
            com.google.android.gms.measurement.internal.d r0 = com.google.android.gms.measurement.internal.C1113d.m3157u(r0, r1, r1)
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            return r0
    }
}
