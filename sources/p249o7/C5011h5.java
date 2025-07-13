package p249o7;

/* renamed from: o7.h5 */
/* loaded from: classes.dex */
public final class C5011h5 extends p249o7.AbstractC5050m4 {
    public C5011h5(com.google.android.gms.measurement.internal.C1113d r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p249o7.AbstractC5050m4
    /* renamed from: k */
    public final boolean mo3138k() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: p */
    public final java.net.HttpURLConnection m11246p(java.net.URL r3) {
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            boolean r0 = r3 instanceof java.net.HttpURLConnection
            if (r0 == 0) goto L2c
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            r0 = 0
            r3.setDefaultUseCaches(r0)
            com.google.android.gms.measurement.internal.d r1 = r2.f5736a
            java.util.Objects.requireNonNull(r1)
            r1 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r1)
            com.google.android.gms.measurement.internal.d r1 = r2.f5736a
            java.util.Objects.requireNonNull(r1)
            r1 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r1)
            r3.setInstanceFollowRedirects(r0)
            r0 = 1
            r3.setDoInput(r0)
            return r3
        L2c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Failed to obtain HTTP connection"
            r3.<init>(r0)
            throw r3
    }
}
