package p085f1;

@android.annotation.SuppressLint({"NewApi"})
/* renamed from: f1.u */
/* loaded from: classes.dex */
public class C1980u {
    /* renamed from: a */
    public static java.util.List<java.lang.String> m5078a(java.util.List<android.media.MediaRoute2Info> r1) {
            if (r1 != 0) goto L8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
        L8:
            java.util.stream.Stream r1 = r1.stream()
            f1.d r0 = p085f1.C1956d.f8521c
            java.util.stream.Stream r1 = r1.filter(r0)
            f1.t r0 = p085f1.C1979t.f8763a
            java.util.stream.Stream r1 = r1.map(r0)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    /* renamed from: b */
    public static p085f1.C1962g m5079b(android.media.MediaRoute2Info r9) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r9.getId()
            java.lang.CharSequence r2 = r9.getName()
            java.lang.String r2 = r2.toString()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "id"
            r3.putString(r4, r1)
            java.lang.String r1 = "name"
            r3.putString(r1, r2)
            int r1 = r9.getConnectionState()
            java.lang.String r2 = "connectionState"
            r3.putInt(r2, r1)
            int r1 = r9.getVolumeHandling()
            java.lang.String r2 = "volumeHandling"
            r3.putInt(r2, r1)
            int r1 = r9.getVolumeMax()
            java.lang.String r2 = "volumeMax"
            r3.putInt(r2, r1)
            int r1 = r9.getVolume()
            java.lang.String r2 = "volume"
            r3.putInt(r2, r1)
            android.os.Bundle r1 = r9.getExtras()
            java.lang.String r2 = "extras"
            r3.putBundle(r2, r1)
            r1 = 1
            java.lang.String r4 = "enabled"
            r3.putBoolean(r4, r1)
            r4 = 0
            java.lang.String r5 = "canDisconnect"
            r3.putBoolean(r5, r4)
            java.lang.CharSequence r5 = r9.getDescription()
            if (r5 == 0) goto L67
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "status"
            r3.putString(r6, r5)
        L67:
            android.net.Uri r5 = r9.getIconUri()
            if (r5 == 0) goto L76
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "iconUri"
            r3.putString(r6, r5)
        L76:
            android.os.Bundle r9 = r9.getExtras()
            if (r9 == 0) goto Lf4
            java.lang.String r5 = "androidx.mediarouter.media.KEY_EXTRAS"
            boolean r6 = r9.containsKey(r5)
            if (r6 == 0) goto Lf4
            java.lang.String r6 = "androidx.mediarouter.media.KEY_DEVICE_TYPE"
            boolean r7 = r9.containsKey(r6)
            if (r7 == 0) goto Lf4
            java.lang.String r7 = "androidx.mediarouter.media.KEY_CONTROL_FILTERS"
            boolean r8 = r9.containsKey(r7)
            if (r8 != 0) goto L95
            goto Lf4
        L95:
            android.os.Bundle r5 = r9.getBundle(r5)
            r3.putBundle(r2, r5)
            int r2 = r9.getInt(r6, r4)
            java.lang.String r4 = "deviceType"
            r3.putInt(r4, r2)
            java.lang.String r2 = "androidx.mediarouter.media.KEY_PLAYBACK_TYPE"
            int r1 = r9.getInt(r2, r1)
            java.lang.String r2 = "playbackType"
            r3.putInt(r2, r1)
            java.util.ArrayList r9 = r9.getParcelableArrayList(r7)
            if (r9 == 0) goto Le7
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto Le7
            java.util.Iterator r9 = r9.iterator()
        Lc0:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Le7
            java.lang.Object r1 = r9.next()
            android.content.IntentFilter r1 = (android.content.IntentFilter) r1
            if (r1 == 0) goto Ldf
            if (r0 != 0) goto Ld5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Ld5:
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto Lc0
            r0.add(r1)
            goto Lc0
        Ldf:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "filter must not be null"
            r9.<init>(r0)
            throw r9
        Le7:
            if (r0 == 0) goto Lee
            java.lang.String r9 = "controlFilters"
            r3.putParcelableArrayList(r9, r0)
        Lee:
            f1.g r9 = new f1.g
            r9.<init>(r3)
            return r9
        Lf4:
            return r0
    }
}
