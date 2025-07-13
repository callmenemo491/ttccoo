package p088f4;

/* renamed from: f4.n */
/* loaded from: classes.dex */
public class C2029n implements p088f4.InterfaceC2013h1 {

    /* renamed from: a */
    public final android.content.Context f9216a;

    /* renamed from: b */
    public final p406x4.C6935i f9217b;

    /* renamed from: c */
    public p406x4.InterfaceC6942p f9218c;

    public C2029n(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f9216a = r1
            x4.i r1 = new x4.i
            r1.<init>()
            r0.f9217b = r1
            int r1 = p406x4.InterfaceC6942p.f27102a
            x4.o r1 = p406x4.C6941o.f27101b
            r0.f9218c = r1
            return
    }

    @Override // p088f4.InterfaceC2013h1
    /* renamed from: a */
    public p088f4.InterfaceC2004e1[] mo5252a(android.os.Handler r14, p387w5.InterfaceC6812o r15, p121h4.InterfaceC2473n r16, p143i5.InterfaceC3088l r17, p427y4.InterfaceC7115f r18) {
            r13 = this;
            r0 = r13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.Context r3 = r0.f9216a
            x4.p r5 = r0.f9218c
            w5.h r12 = new w5.h
            x4.i r4 = r0.f9217b
            r6 = 5000(0x1388, double:2.4703E-320)
            r8 = 0
            r11 = 50
            r2 = r12
            r9 = r14
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11)
            r1.add(r12)
            android.content.Context r2 = r0.f9216a
            h4.u r10 = new h4.u
            h4.e r3 = p121h4.C2463e.f11024c
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.media.action.HDMI_AUDIO_PLUG"
            r3.<init>(r4)
            r4 = 0
            android.content.Intent r3 = r2.registerReceiver(r4, r3)
            int r4 = p371v5.C6552b0.f25624a
            r5 = 1
            r11 = 0
            r6 = 17
            if (r4 < r6) goto L4a
            java.lang.String r6 = p371v5.C6552b0.f25626c
            java.lang.String r7 = "Amazon"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L48
            java.lang.String r7 = "Xiaomi"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L4a
        L48:
            r6 = 1
            goto L4b
        L4a:
            r6 = 0
        L4b:
            if (r6 == 0) goto L5d
            android.content.ContentResolver r6 = r2.getContentResolver()
            java.lang.String r7 = "external_surround_sound_enabled"
            int r6 = android.provider.Settings.Global.getInt(r6, r7, r11)
            if (r6 != r5) goto L5d
            h4.e r2 = p121h4.C2463e.f11025d
        L5b:
            r4 = r2
            goto La7
        L5d:
            r6 = 29
            r7 = 8
            if (r4 < r6) goto L87
            boolean r6 = p371v5.C6552b0.m13333z(r2)
            if (r6 != 0) goto L7d
            r6 = 23
            if (r4 < r6) goto L7a
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r4 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r4)
            if (r2 == 0) goto L7a
            goto L7b
        L7a:
            r5 = 0
        L7b:
            if (r5 == 0) goto L87
        L7d:
            h4.e r2 = new h4.e
            int[] r3 = p121h4.C2463e.a.m6263a()
            r2.<init>(r3, r7)
            goto L5b
        L87:
            if (r3 == 0) goto La4
            java.lang.String r2 = "android.media.extra.AUDIO_PLUG_STATE"
            int r2 = r3.getIntExtra(r2, r11)
            if (r2 != 0) goto L92
            goto La4
        L92:
            h4.e r2 = new h4.e
            java.lang.String r4 = "android.media.extra.ENCODINGS"
            int[] r4 = r3.getIntArrayExtra(r4)
            java.lang.String r5 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r3 = r3.getIntExtra(r5, r7)
            r2.<init>(r4, r3)
            goto L5b
        La4:
            h4.e r2 = p121h4.C2463e.f11024c
            goto L5b
        La7:
            h4.u$d r5 = new h4.u$d
            h4.f[] r2 = new p121h4.InterfaceC2465f[r11]
            r5.<init>(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            android.content.Context r4 = r0.f9216a
            x4.p r6 = r0.f9218c
            h4.x r2 = new h4.x
            x4.i r5 = r0.f9217b
            r3 = r2
            r8 = r14
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.add(r2)
            android.os.Looper r2 = r14.getLooper()
            i5.m r3 = new i5.m
            r4 = r17
            r3.<init>(r4, r2)
            r1.add(r3)
            android.os.Looper r2 = r14.getLooper()
            y4.g r3 = new y4.g
            r4 = r18
            r3.<init>(r4, r2)
            r1.add(r3)
            x5.b r2 = new x5.b
            r2.<init>()
            r1.add(r2)
            f4.e1[] r2 = new p088f4.InterfaceC2004e1[r11]
            java.lang.Object[] r1 = r1.toArray(r2)
            f4.e1[] r1 = (p088f4.InterfaceC2004e1[]) r1
            return r1
    }
}
