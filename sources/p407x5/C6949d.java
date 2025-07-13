package p407x5;

/* renamed from: x5.d */
/* loaded from: classes.dex */
public final class C6949d implements android.hardware.SensorEventListener {

    /* renamed from: a */
    public final float[] f27124a;

    /* renamed from: b */
    public final float[] f27125b;

    /* renamed from: c */
    public final float[] f27126c;

    /* renamed from: d */
    public final float[] f27127d;

    /* renamed from: e */
    public final android.view.Display f27128e;

    /* renamed from: f */
    public final p407x5.C6949d.a[] f27129f;

    /* renamed from: g */
    public boolean f27130g;

    /* renamed from: x5.d$a */
    public interface a {
        /* renamed from: a */
        void mo14117a(float[] r1, float r2);
    }

    public C6949d(android.view.Display r3, p407x5.C6949d.a... r4) {
            r2 = this;
            r2.<init>()
            r0 = 16
            float[] r1 = new float[r0]
            r2.f27124a = r1
            float[] r1 = new float[r0]
            r2.f27125b = r1
            float[] r0 = new float[r0]
            r2.f27126c = r0
            r0 = 3
            float[] r0 = new float[r0]
            r2.f27127d = r0
            r2.f27128e = r3
            r2.f27129f = r4
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent r19) {
            r18 = this;
            r0 = r18
            float[] r1 = r0.f27124a
            r2 = r19
            float[] r2 = r2.values
            android.hardware.SensorManager.getRotationMatrixFromVector(r1, r2)
            float[] r1 = r0.f27124a
            android.view.Display r2 = r0.f27128e
            int r2 = r2.getRotation()
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            r6 = 129(0x81, float:1.81E-43)
            r7 = 130(0x82, float:1.82E-43)
            if (r2 == r5) goto L2d
            if (r2 == r4) goto L30
            r6 = 3
            if (r2 != r6) goto L27
            r6 = 130(0x82, float:1.82E-43)
            r7 = 1
            goto L30
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L2d:
            r6 = 2
            r7 = 129(0x81, float:1.81E-43)
        L30:
            float[] r2 = r0.f27125b
            int r8 = r2.length
            java.lang.System.arraycopy(r1, r3, r2, r3, r8)
            float[] r2 = r0.f27125b
            android.hardware.SensorManager.remapCoordinateSystem(r2, r6, r7, r1)
        L3b:
            float[] r1 = r0.f27124a
            float[] r2 = r0.f27125b
            r6 = 131(0x83, float:1.84E-43)
            android.hardware.SensorManager.remapCoordinateSystem(r1, r5, r6, r2)
            float[] r1 = r0.f27125b
            float[] r2 = r0.f27127d
            android.hardware.SensorManager.getOrientation(r1, r2)
            float[] r1 = r0.f27127d
            r1 = r1[r4]
            float[] r6 = r0.f27124a
            r7 = 0
            r8 = 1119092736(0x42b40000, float:90.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 0
            android.opengl.Matrix.rotateM(r6, r7, r8, r9, r10, r11)
            float[] r12 = r0.f27124a
            boolean r2 = r0.f27130g
            if (r2 != 0) goto L68
            float[] r2 = r0.f27126c
            p407x5.C6948c.m14111a(r2, r12)
            r0.f27130g = r5
        L68:
            float[] r2 = r0.f27125b
            int r4 = r2.length
            java.lang.System.arraycopy(r12, r3, r2, r3, r4)
            r13 = 0
            float[] r14 = r0.f27125b
            r15 = 0
            float[] r2 = r0.f27126c
            r17 = 0
            r16 = r2
            android.opengl.Matrix.multiplyMM(r12, r13, r14, r15, r16, r17)
            float[] r2 = r0.f27124a
            x5.d$a[] r4 = r0.f27129f
            int r5 = r4.length
        L80:
            if (r3 >= r5) goto L8a
            r6 = r4[r3]
            r6.mo14117a(r2, r1)
            int r3 = r3 + 1
            goto L80
        L8a:
            return
    }
}
