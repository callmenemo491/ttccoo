package p249o7;

/* renamed from: o7.o3 */
/* loaded from: classes.dex */
public final class C5065o3 {

    /* renamed from: a */
    public final java.lang.String f19917a;

    /* renamed from: b */
    public final android.os.Bundle f19918b;

    /* renamed from: c */
    public android.os.Bundle f19919c;

    /* renamed from: d */
    public final /* synthetic */ com.google.android.gms.measurement.internal.C1112c f19920d;

    public C5065o3(com.google.android.gms.measurement.internal.C1112c r1) {
            r0 = this;
            r0.f19920d = r1
            r0.<init>()
            java.lang.String r1 = "default_event_parameters"
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r0.f19917a = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.f19918b = r1
            return
    }

    /* renamed from: a */
    public final android.os.Bundle m11376a() {
            r11 = this;
            android.os.Bundle r0 = r11.f19919c
            if (r0 == 0) goto L6
            goto Lce
        L6:
            com.google.android.gms.measurement.internal.c r0 = r11.f19920d
            android.content.SharedPreferences r0 = r0.m3147p()
            java.lang.String r1 = r11.f19917a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto Lc6
            android.os.Bundle r1 = new android.os.Bundle     // Catch: org.json.JSONException -> Lb7
            r1.<init>()     // Catch: org.json.JSONException -> Lb7
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lb7
            r2.<init>(r0)     // Catch: org.json.JSONException -> Lb7
            r0 = 0
            r3 = 0
        L21:
            int r4 = r2.length()     // Catch: org.json.JSONException -> Lb7
            if (r3 >= r4) goto Lb4
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> La1
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> La1
            int r7 = r6.hashCode()     // Catch: java.lang.Throwable -> La1
            r8 = 100
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L5e
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L54
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L4a
            goto L68
        L4a:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L68
            r7 = 0
            goto L69
        L54:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L68
            r7 = 2
            goto L69
        L5e:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L68
            r7 = 1
            goto L69
        L68:
            r7 = -1
        L69:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L99
            if (r7 == r10) goto L8d
            if (r7 == r9) goto L81
            com.google.android.gms.measurement.internal.c r4 = r11.f19920d     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            o7.f3 r4 = r4.f5672f     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.m11170d(r5, r6)     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            goto Lb0
        L81:
            java.lang.String r4 = r4.getString(r8)     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            long r6 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            r1.putLong(r5, r6)     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            goto Lb0
        L8d:
            java.lang.String r4 = r4.getString(r8)     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            double r6 = java.lang.Double.parseDouble(r4)     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            r1.putDouble(r5, r6)     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            goto Lb0
        L99:
            java.lang.String r4 = r4.getString(r8)     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            r1.putString(r5, r4)     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> La1
            goto Lb0
        La1:
            com.google.android.gms.measurement.internal.c r4 = r11.f19920d     // Catch: org.json.JSONException -> Lb7
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a     // Catch: org.json.JSONException -> Lb7
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()     // Catch: org.json.JSONException -> Lb7
            o7.f3 r4 = r4.f5672f     // Catch: org.json.JSONException -> Lb7
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.m11169c(r5)     // Catch: org.json.JSONException -> Lb7
        Lb0:
            int r3 = r3 + 1
            goto L21
        Lb4:
            r11.f19919c = r1     // Catch: org.json.JSONException -> Lb7
            goto Lc6
        Lb7:
            com.google.android.gms.measurement.internal.c r0 = r11.f19920d
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5672f
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.m11169c(r1)
        Lc6:
            android.os.Bundle r0 = r11.f19919c
            if (r0 != 0) goto Lce
            android.os.Bundle r0 = r11.f19918b
            r11.f19919c = r0
        Lce:
            android.os.Bundle r0 = r11.f19919c
            return r0
    }

    /* renamed from: b */
    public final void m11377b(android.os.Bundle r9) {
            r8 = this;
            if (r9 != 0) goto L7
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L7:
            com.google.android.gms.measurement.internal.c r0 = r8.f19920d
            android.content.SharedPreferences r0 = r0.m3147p()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            int r1 = r9.size()
            if (r1 != 0) goto L1e
            java.lang.String r1 = r8.f19917a
            r0.remove(r1)
            goto L9c
        L1e:
            java.lang.String r1 = r8.f19917a
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Set r3 = r9.keySet()
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L95
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r9.get(r4)
            if (r5 == 0) goto L2d
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L84
            r6.<init>()     // Catch: org.json.JSONException -> L84
            java.lang.String r7 = "n"
            r6.put(r7, r4)     // Catch: org.json.JSONException -> L84
            java.lang.String r4 = "v"
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch: org.json.JSONException -> L84
            r6.put(r4, r7)     // Catch: org.json.JSONException -> L84
            boolean r4 = r5 instanceof java.lang.String     // Catch: org.json.JSONException -> L84
            java.lang.String r7 = "t"
            if (r4 == 0) goto L5e
            java.lang.String r4 = "s"
        L5a:
            r6.put(r7, r4)     // Catch: org.json.JSONException -> L84
            goto L6c
        L5e:
            boolean r4 = r5 instanceof java.lang.Long     // Catch: org.json.JSONException -> L84
            if (r4 == 0) goto L65
            java.lang.String r4 = "l"
            goto L5a
        L65:
            boolean r4 = r5 instanceof java.lang.Double     // Catch: org.json.JSONException -> L84
            if (r4 == 0) goto L70
            java.lang.String r4 = "d"
            goto L5a
        L6c:
            r2.put(r6)     // Catch: org.json.JSONException -> L84
            goto L2d
        L70:
            com.google.android.gms.measurement.internal.c r4 = r8.f19920d     // Catch: org.json.JSONException -> L84
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a     // Catch: org.json.JSONException -> L84
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()     // Catch: org.json.JSONException -> L84
            o7.f3 r4 = r4.f5672f     // Catch: org.json.JSONException -> L84
            java.lang.String r6 = "Cannot serialize bundle value to SharedPreferences. Type"
            java.lang.Class r5 = r5.getClass()     // Catch: org.json.JSONException -> L84
            r4.m11170d(r6, r5)     // Catch: org.json.JSONException -> L84
            goto L2d
        L84:
            r4 = move-exception
            com.google.android.gms.measurement.internal.c r5 = r8.f19920d
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a
            com.google.android.gms.measurement.internal.b r5 = r5.mo3162d()
            o7.f3 r5 = r5.f5672f
            java.lang.String r6 = "Cannot serialize bundle value to SharedPreferences"
            r5.m11170d(r6, r4)
            goto L2d
        L95:
            java.lang.String r2 = r2.toString()
            r0.putString(r1, r2)
        L9c:
            r0.apply()
            r8.f19919c = r9
            return
    }
}
