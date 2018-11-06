package com.cit.designpatterns.builder;

public class HuaweiBuilder extends Builder
{
    private HuaweiPhone huaweiPhone;

    public HuaweiBuilder()
    {
        huaweiPhone = new HuaweiPhone();
    }

    @Override
    public void buildCpu(String cpu)
    {
        huaweiPhone.setCpu(cpu);
    }

    @Override
    public void builderScreen(String screen)
    {
        huaweiPhone.setScreen(screen);
    }

    @Override
    public void buildCamera(String camera)
    {
        huaweiPhone.setCamera(camera);
    }

    @Override
    public void buildBattery(String battery)
    {
        huaweiPhone.setBattery(battery);
    }

    @Override
    public void buildOs(String os)
    {
        huaweiPhone.setOs(os);
    }

    @Override
    public Phone build()
    {
        return huaweiPhone;
    }
}
