package p249o7;

/* renamed from: o7.m */
/* loaded from: classes.dex */
public final class C5045m {

    /* renamed from: a */
    public final java.lang.String f19833a;

    /* renamed from: b */
    public final java.lang.String f19834b;

    /* renamed from: c */
    public final java.lang.String f19835c;

    /* renamed from: d */
    public final long f19836d;

    /* renamed from: e */
    public final long f19837e;

    /* renamed from: f */
    public final p249o7.C5061o f19838f;

    public C5045m(com.google.android.gms.measurement.internal.C1113d r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7, long r9, android.os.Bundle r11) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            com.google.android.gms.common.internal.C1101a.m3100e(r6)
            r2.f19833a = r5
            r2.f19834b = r6
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 1
            if (r0 != r6) goto L15
            r4 = 0
        L15:
            r2.f19835c = r4
            r2.f19836d = r7
            r2.f19837e = r9
            r0 = 0
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 == 0) goto L34
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 <= 0) goto L34
            com.google.android.gms.measurement.internal.b r4 = r3.mo3162d()
            o7.f3 r4 = r4.f5675i
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r5)
            java.lang.String r6 = "Event created with reverse previous/current timestamps. appId"
            r4.m11170d(r6, r5)
        L34:
            boolean r4 = r11.isEmpty()
            if (r4 != 0) goto L92
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r11)
            java.util.Set r5 = r4.keySet()
            java.util.Iterator r5 = r5.iterator()
        L47:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8c
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L61
            com.google.android.gms.measurement.internal.b r6 = r3.mo3162d()
            o7.f3 r6 = r6.f5672f
            java.lang.String r7 = "Param name can't be null"
            r6.m11169c(r7)
            goto L80
        L61:
            com.google.android.gms.measurement.internal.f r7 = r3.m3158A()
            java.lang.Object r8 = r4.get(r6)
            java.lang.Object r7 = r7.m3228p(r6, r8)
            if (r7 != 0) goto L84
            com.google.android.gms.measurement.internal.b r7 = r3.mo3162d()
            o7.f3 r7 = r7.f5675i
            o7.c3 r8 = r3.f5722m
            java.lang.String r6 = r8.m11117e(r6)
            java.lang.String r8 = "Param value can't be null"
            r7.m11170d(r8, r6)
        L80:
            r5.remove()
            goto L47
        L84:
            com.google.android.gms.measurement.internal.f r8 = r3.m3158A()
            r8.m3197B(r4, r6, r7)
            goto L47
        L8c:
            o7.o r3 = new o7.o
            r3.<init>(r4)
            goto L9c
        L92:
            o7.o r3 = new o7.o
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r3.<init>(r4)
        L9c:
            r2.f19838f = r3
            return
    }

    public C5045m(com.google.android.gms.measurement.internal.C1113d r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7, long r9, p249o7.C5061o r11) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            com.google.android.gms.common.internal.C1101a.m3100e(r6)
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r11, r0)
            r2.f19833a = r5
            r2.f19834b = r6
            r0 = 1
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r0 != r1) goto L1a
            r4 = 0
        L1a:
            r2.f19835c = r4
            r2.f19836d = r7
            r2.f19837e = r9
            r0 = 0
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 == 0) goto L3d
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 <= 0) goto L3d
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5675i
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1111b.m3134u(r5)
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1111b.m3134u(r6)
            java.lang.String r6 = "Event created with reverse previous/current timestamps. appId, name"
            r3.m11171e(r6, r4, r5)
        L3d:
            r2.f19838f = r11
            return
    }

    /* renamed from: a */
    public final p249o7.C5045m m11313a(com.google.android.gms.measurement.internal.C1113d r12, long r13) {
            r11 = this;
            o7.m r10 = new o7.m
            java.lang.String r2 = r11.f19835c
            java.lang.String r3 = r11.f19833a
            java.lang.String r4 = r11.f19834b
            long r5 = r11.f19836d
            o7.o r9 = r11.f19838f
            r0 = r10
            r1 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r7, r9)
            return r10
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.String r0 = r8.f19833a
            java.lang.String r1 = r8.f19834b
            o7.o r2 = r8.f19838f
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r5 = r2.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 33
            int r3 = androidx.appcompat.widget.C0267d.m705a(r3, r7, r4, r5)
            r6.<init>(r3)
            java.lang.String r3 = "Event{appId='"
            java.lang.String r4 = "', name='"
            p179k1.C3661s.m8090a(r6, r3, r0, r4, r1)
            java.lang.String r0 = "', params="
            r6.append(r0)
            r6.append(r2)
            r0 = 125(0x7d, float:1.75E-43)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            return r0
    }
}
