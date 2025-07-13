package p057db;

/* renamed from: db.u */
/* loaded from: classes.dex */
public class C1420u {
    /* renamed from: a */
    public static java.lang.String m3943a(android.os.Bundle r1) {
            java.lang.String r0 = "from"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L11
            java.lang.String r0 = "/topics/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L11
            return r1
        L11:
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public static void m3944b(java.lang.String r5, android.os.Bundle r6) {
            if (r6 != 0) goto L7
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L7:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "google.c.a.c_id"
            java.lang.String r1 = r6.getString(r1)
            if (r1 == 0) goto L19
            java.lang.String r2 = "_nmid"
            r0.putString(r2, r1)
        L19:
            java.lang.String r1 = "google.c.a.c_l"
            java.lang.String r1 = r6.getString(r1)
            if (r1 == 0) goto L26
            java.lang.String r2 = "_nmn"
            r0.putString(r2, r1)
        L26:
            java.lang.String r1 = "google.c.a.m_l"
            java.lang.String r1 = r6.getString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L37
            java.lang.String r2 = "label"
            r0.putString(r2, r1)
        L37:
            java.lang.String r1 = "google.c.a.m_c"
            java.lang.String r1 = r6.getString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L48
            java.lang.String r2 = "message_channel"
            r0.putString(r2, r1)
        L48:
            java.lang.String r1 = m3943a(r6)
            if (r1 == 0) goto L53
            java.lang.String r2 = "_nt"
            r0.putString(r2, r1)
        L53:
            java.lang.String r1 = "google.c.a.ts"
            java.lang.String r1 = r6.getString(r1)
            java.lang.String r2 = "FirebaseMessaging"
            if (r1 == 0) goto L6d
            java.lang.String r3 = "_nmt"
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L67
            r0.putInt(r3, r1)     // Catch: java.lang.NumberFormatException -> L67
            goto L6d
        L67:
            r1 = move-exception
            java.lang.String r3 = "Error while parsing timestamp in GCM event"
            android.util.Log.w(r2, r3, r1)
        L6d:
            java.lang.String r1 = "google.c.a.udt"
            boolean r3 = r6.containsKey(r1)
            if (r3 == 0) goto L7a
            java.lang.String r1 = r6.getString(r1)
            goto L7b
        L7a:
            r1 = 0
        L7b:
            if (r1 == 0) goto L8d
            java.lang.String r3 = "_ndt"
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L87
            r0.putInt(r3, r1)     // Catch: java.lang.NumberFormatException -> L87
            goto L8d
        L87:
            r1 = move-exception
            java.lang.String r3 = "Error while parsing use_device_time in GCM event"
            android.util.Log.w(r2, r3, r1)
        L8d:
            boolean r6 = p057db.C1422w.m3951l(r6)
            r1 = 1
            if (r1 == r6) goto L97
            java.lang.String r6 = "data"
            goto L99
        L97:
            java.lang.String r6 = "display"
        L99:
            java.lang.String r1 = "_nr"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto La9
            java.lang.String r1 = "_nf"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Lae
        La9:
            java.lang.String r1 = "_nmc"
            r0.putString(r1, r6)
        Lae:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r2, r6)
            if (r6 == 0) goto Le0
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r1 = r5.length()
            int r3 = r6.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + 37
            int r1 = r1 + r3
            r4.<init>(r1)
            java.lang.String r1 = "Logging to scion event="
            r4.append(r1)
            r4.append(r5)
            java.lang.String r1 = " scionPayload="
            r4.append(r1)
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            android.util.Log.d(r2, r6)
        Le0:
            o9.d r6 = p251o9.C5180d.m11494c()
            java.lang.Class<s9.a> r1 = p329s9.InterfaceC5997a.class
            r6.m11497a()
            y9.i r6 = r6.f20315d
            java.lang.Object r6 = r6.mo14246a(r1)
            s9.a r6 = (p329s9.InterfaceC5997a) r6
            if (r6 == 0) goto Lf9
            java.lang.String r1 = "fcm"
            r6.mo12483f(r1, r5, r0)
            return
        Lf9:
            java.lang.String r5 = "Unable to log event: analytics library is missing"
            android.util.Log.w(r2, r5)
            return
    }

    /* renamed from: c */
    public static boolean m3945c(android.content.Intent r2) {
            if (r2 == 0) goto L23
            java.lang.String r0 = r2.getAction()
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            goto L23
        Lf:
            android.os.Bundle r2 = r2.getExtras()
            if (r2 != 0) goto L16
            goto L23
        L16:
            java.lang.String r0 = "google.c.a.e"
            java.lang.String r2 = r2.getString(r0)
            java.lang.String r0 = "1"
            boolean r2 = r0.equals(r2)
            goto L24
        L23:
            r2 = 0
        L24:
            return r2
    }
}
